package com.assessment.departure;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class NextBusDAO {
	
	private static final Logger log = LoggerFactory.getLogger(NextBusDAO.class);
	public final int stopTag;

	public NextBusDAO(int stopTag) {
		this.stopTag = stopTag;
	}

	public DepartureInfo retrieveDepartureInfo() {
		DepartureInfo info = null;
		
		URL url;
		try {
			url = new URL("http://webservices.nextbus.com/service/publicXMLFeed?command=predictions&a=sf-muni&r=N&s="+stopTag+"&useShortTitles=true");
			
			log.info("Retrieving information from the following URL: {}", url.toString());
			
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(url.openStream());
			XPath xpath = XPathFactory.newInstance().newXPath();
				
			String stopTitle = xpath.evaluate("/body/predictions/@stopTitle", doc);
			String direction = xpath.evaluate("/body/predictions/direction/@title", doc);
			int waitTime = Integer.parseInt(xpath.evaluate("/body/predictions/direction/prediction[1]/@minutes", doc));
			
			log.info("Departure Info obtained. StopTitle: {}, Direction: {}, WaitTime in minutes: {}", stopTitle, direction, waitTime);
			
			info = new DepartureInfo(stopTitle, direction, waitTime);
			
		} catch (MalformedURLException e) {
			log.error(e.getMessage());
		} catch (SAXException e) {
			log.error(e.getMessage());
		} catch (IOException e) {
			log.error(e.getMessage());
		} catch (ParserConfigurationException e) {
			log.error(e.getMessage());
		} catch (XPathExpressionException e) {
			log.error(e.getMessage());
		}
			
		return info;
	}
	
	public int getStopTag() {
		return stopTag;
	}

}

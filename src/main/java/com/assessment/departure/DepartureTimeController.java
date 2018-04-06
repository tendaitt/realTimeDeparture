package com.assessment.departure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartureTimeController {
	
	private static final Logger log = LoggerFactory.getLogger(DepartureTimeController.class);
	public NextBusDAO nextBustData;

	@RequestMapping("/getDepartureTime")
	public DepartureInfo getDepartureTime(@RequestParam(value="stopTag", defaultValue="5205") int stopTag) {
		
		log.info("Received request with stopTag of value: {} ", stopTag);
		nextBustData = new NextBusDAO(stopTag);
		
		return nextBustData.retrieveDepartureInfo();
		
	}
}

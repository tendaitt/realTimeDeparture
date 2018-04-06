package com.assessment.departure;

public class DepartureInfo {
	
	public final String stopTitle;
	public final String direction;
	public final int waitTime;
	
	public DepartureInfo(String stopTitle, String direction, int waitTime) {
		this.stopTitle = stopTitle;
		this.direction = direction;
		this.waitTime = waitTime;
	}
	
	public String getStopTitle() {
		return stopTitle;
	}
	
	public String getDirection() {
		return direction;
	}
	
	public int getWaitTime() {
		return waitTime;
	}

}

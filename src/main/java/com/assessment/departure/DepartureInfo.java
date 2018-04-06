package com.assessment.departure;

public class DepartureInfo {
	
	private final String stopTitle;
	private final String direction;
	private final int waitTime;
	
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

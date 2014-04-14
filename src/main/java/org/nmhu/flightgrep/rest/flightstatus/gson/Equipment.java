package org.nmhu.flightgrep.rest.flightstatus.gson;

public class Equipment {
	
	// DO NOT CHANGE members - must match FlightStatus objects in 
	// responses for GSON deserialization to work
	private String iata;
	private String name;
	private Boolean turboProp;
	private Boolean jet;
	private Boolean widebody;
	private Boolean regional;
	
	public Equipment(){}

	public String getIata() {
		return iata;
	}

	public String getName() {
		return name;
	}

	public Boolean getTurboProp() {
		return turboProp;
	}

	public Boolean getJet() {
		return jet;
	}

	public Boolean getWidebody() {
		return widebody;
	}

	public Boolean getRegional() {
		return regional;
	}	

}

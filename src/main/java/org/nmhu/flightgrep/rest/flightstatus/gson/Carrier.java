package org.nmhu.flightgrep.rest.flightstatus.gson;

public class Carrier {	
	
	// DO NOT CHANGE members - must match FlightStatus objects in 
	// responses for GSON deserialization to work
	private String fs;
	private String iata;
	private String icao;
	private String name;
	private String phoneNumber;
	private Boolean active;
	
	public Carrier(){}

	public String getFs() {
		return fs;
	}

	public String getIata() {
		return iata;
	}

	public String getIcao() {
		return icao;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Boolean getActive() {
		return active;
	}	

}

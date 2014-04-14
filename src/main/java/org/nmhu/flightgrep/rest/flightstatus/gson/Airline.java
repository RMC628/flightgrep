package org.nmhu.flightgrep.rest.flightstatus.gson;

import org.nmhu.flightgrep.controller.bean.LogBean;

public class Airline {
	
	// DO NOT CHANGE - must match FlightStatus objects in 
	// responses for GSON deserialization to work
	private String fs;
	private String iata;
	private String icao;
	private String shortName;
	private String name;
	private String logoUrl;
	private String phoneNumber;
	private Boolean active;	

	public Airline(){}

	public String getFs() {
		return fs;
	}

	public String getIata() {
		return iata;
	}

	public String getIcao() {
		return icao;
	}

	public String getShortName() {
		return shortName;
	}

	public String getName() {
		LogBean.severe("Airline.getName() called with value=" + name);
		return name;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Boolean getActive() {
		return active;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}	
	
	
	
}

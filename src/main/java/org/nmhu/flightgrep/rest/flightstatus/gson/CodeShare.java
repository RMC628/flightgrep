package org.nmhu.flightgrep.rest.flightstatus.gson;


public class CodeShare {
	
	// DO NOT CHANGE members - must match FlightStatus objects in 
	// responses for GSON deserialization to work
	private Carrier carrier;
	private String flightNumber;
	private String serviceType;
	private String[] serviceClasses;
	private String[] trafficRestrictions;
	private Long referenceCode;
	
	public CodeShare(){}

	public Carrier getCarrier() {
		return carrier;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getServiceType() {
		return serviceType;
	}

	public String[] getServiceClasses() {
		return serviceClasses;
	}

	public String[] getTrafficRestrictions() {
		return trafficRestrictions;
	}

	public Long getReferenceCode() {
		return referenceCode;
	}	
	
	

}

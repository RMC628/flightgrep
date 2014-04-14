package org.nmhu.flightgrep.rest.flightstatus.gson;


public class Request {
	
	private Carrier carrier;
	private String requestedCode;
	private String fsCode;
	private CodeType codeType;
	private FlightNumber flightNumber;
	private Boolean departing;
	private Date date;
	private String url;	
	
	public Request(){}

	public Carrier getCarrier() {
		return carrier;
	}

	public String getRequestedCode() {
		return requestedCode;
	}

	public String getFsCode() {
		return fsCode;
	}

	public CodeType getCodeType() {
		return codeType;
	}

	public FlightNumber getFlightNumber() {
		return flightNumber;
	}

	public Boolean getDeparting() {
		return departing;
	}

	public Date getDate() {
		return date;
	}

	public String getUrl() {
		return url;
	}
	
	
	

}

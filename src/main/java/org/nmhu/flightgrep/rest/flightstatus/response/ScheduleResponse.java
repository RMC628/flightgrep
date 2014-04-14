package org.nmhu.flightgrep.rest.flightstatus.response;

import org.nmhu.flightgrep.rest.flightstatus.gson.Airline;
import org.nmhu.flightgrep.rest.flightstatus.gson.Flight;
import org.nmhu.flightgrep.rest.flightstatus.gson.Request;

public class ScheduleResponse extends AbstractResponse {
	
	private Request request;

	private Flight[] scheduledFlights;
	private Airline[] airlines;	
	
	public ScheduleResponse(){}

	public Request getRequest() {
		return request;
	}


	public Flight[] getScheduledFlights() {
		return scheduledFlights;
	}


	public Airline[] getAirlines() {
		return airlines;
	}

	
	
	
}

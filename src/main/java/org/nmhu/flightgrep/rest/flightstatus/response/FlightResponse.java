package org.nmhu.flightgrep.rest.flightstatus.response;

import org.nmhu.flightgrep.rest.flightstatus.gson.Flight;


public class FlightResponse extends AbstractResponse {

	private Flight flight;
	
	public FlightResponse(){}
	
	public Flight getFlight() {
		
		return this.flight;
	}
	
	
}

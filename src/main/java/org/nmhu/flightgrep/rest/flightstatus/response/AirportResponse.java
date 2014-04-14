package org.nmhu.flightgrep.rest.flightstatus.response;

import org.nmhu.flightgrep.rest.flightstatus.gson.Airport;

public class AirportResponse extends AbstractResponse {
	
	private Airport airport;
		
	public AirportResponse() {}
	
	public Airport getAirport(){
		
		return this.airport;		
	}
}

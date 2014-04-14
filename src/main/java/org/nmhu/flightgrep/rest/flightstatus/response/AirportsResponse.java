package org.nmhu.flightgrep.rest.flightstatus.response;

import org.nmhu.flightgrep.rest.flightstatus.gson.Airport;

public class AirportsResponse extends AbstractResponse {

	private Airport[] airports;
	
	public AirportsResponse(){}
	
	public Airport[] getAirports(){
		return this.airports;
	}
	
	
}

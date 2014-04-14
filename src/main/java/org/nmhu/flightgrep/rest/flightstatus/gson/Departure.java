package org.nmhu.flightgrep.rest.flightstatus.gson;

public class Departure {

	private Airport airport;
	private String metro;
	
	public Airport getAirport() {
		return airport;
	}
	public void setAirport(Airport airport) {
		this.airport = airport;
	}
	public String getMetro() {
		return metro;
	}
	public void setMetro(String metro) {
		this.metro = metro;
	}	
	
}

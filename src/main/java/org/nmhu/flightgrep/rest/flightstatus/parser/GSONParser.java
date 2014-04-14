package org.nmhu.flightgrep.rest.flightstatus.parser;

import org.nmhu.flightgrep.rest.flightstatus.response.AirportResponse;
import org.nmhu.flightgrep.rest.flightstatus.response.AirportsResponse;
import org.nmhu.flightgrep.rest.flightstatus.response.ConnResponse;
import org.nmhu.flightgrep.rest.flightstatus.response.FlightResponse;
import org.nmhu.flightgrep.rest.flightstatus.response.ScheduleResponse;

import com.google.gson.Gson;

public class GSONParser extends AbstractParser {

	
	private static Gson gson = new Gson();			
	
		
	public static ScheduleResponse parseScheduleResponse(String json) {
		ScheduleResponse result = gson.fromJson(json, ScheduleResponse.class);
		return result;
	}
	
	public static AirportResponse parseAirportResponse(String json){
		AirportResponse result = gson.fromJson(json, AirportResponse.class);
		return result;
	}
	
	public static AirportsResponse parseAirportsResponse(String json){
		AirportsResponse result = gson.fromJson(json, AirportsResponse.class);
		return result;
	}
	
	public static FlightResponse parseFlightResponse(String json){
		FlightResponse result = gson.fromJson(json, FlightResponse.class);
		return result;
	}
	
	public static ConnResponse parseConnResponse(String json) {
		ConnResponse result = gson.fromJson(json, ConnResponse.class);
		return result;
	}
	
	
	
	
	
	
	
}

package org.nmhu.flightgrep.rest.flightstatus.Factory;

import org.nmhu.flightgrep.rest.flightstatus.gson.Airport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class AirportFactory {

	
	public static Airport createFromJson(String json) {
		
		Gson gson = new GsonBuilder().create();
		Airport airport = gson.fromJson(json, Airport.class);
		
		return airport;		
		
	}
	
}

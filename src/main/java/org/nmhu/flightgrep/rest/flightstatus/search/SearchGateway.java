package org.nmhu.flightgrep.rest.flightstatus.search;

import java.util.ArrayList;
import java.util.List;

import org.nmhu.flightgrep.controller.bean.LogBean;
import org.nmhu.flightgrep.rest.flightstatus.gson.Airport;
import org.nmhu.flightgrep.rest.flightstatus.gson.Flight;
import org.nmhu.flightgrep.rest.flightstatus.request.RequestBuilder;
import org.nmhu.flightgrep.rest.flightstatus.request.SearchRequest;
import org.nmhu.flightgrep.rest.flightstatus.response.*;
import org.nmhu.flightgrep.rest.flightstatus.searchengine.SearchEngine;
import org.nmhu.flightgrep.rest.flightstatus.parser.GSONParser;
import org.nmhu.flightgrep.rest.flightstatus.gson.Airline;
import org.primefaces.util.ArrayUtils;

public class SearchGateway {

	private static RequestBuilder searchFactory = new RequestBuilder();

	private static Airport[] doAirportsResponse(SearchRequest req) {

		AirportsResponse response = GSONParser
				.parseAirportsResponse(SearchEngine.execute(req));
		return response.getAirports();
	}

	private static Airport doAirportResponse(SearchRequest req) {

		AirportResponse response = GSONParser.parseAirportResponse(SearchEngine
				.execute(req));
		return response.getAirport();

	}

	private static Flight[] doScheduleResponse(SearchRequest req) {

		ScheduleResponse response = GSONParser
				.parseScheduleResponse(SearchEngine.execute(req));

		return response.getScheduledFlights();

	}

	private static ConnResponse doConnectionsResponse(SearchRequest req) {
		ConnResponse response = GSONParser.parseConnResponse(SearchEngine
				.execute(req));
		return response;
		
		
	}

	public static Airport[] getAllAirports() {

		SearchRequest req = searchFactory.getAllAirports();
		return doAirportsResponse(req);

	}

	public static Airport[] getAirportsByCity(String cityCode) {

		SearchRequest req = searchFactory.getAirportsByCity(cityCode);
		return doAirportsResponse(req);
	}

	public static Flight[] getFlightsDepartingAirport(String airportCode,
			String month, String day, String year, String hour) {

		SearchRequest req = searchFactory.getFlightsDepartingAirport(
				airportCode, month, day, year, hour);
		return doScheduleResponse(req);
	}

	public static Flight[] getFlightsArrivingAtAirport(String airportCode,
			String month, String day, String year, String hour) {

		SearchRequest req = searchFactory.getFlightsArrivingAirport(
				airportCode, month, day, year, hour);
		return doScheduleResponse(req);
	}

	public static ConnResponse getDepartingFlightsByRoute(
			String departureAirportCode, String arrivalAirportCode,
			String month, String day, String year) {

		SearchRequest req = searchFactory.getDepartingFlightsByRoute(
				departureAirportCode, arrivalAirportCode, month, day, year);
		return doConnectionsResponse(req);
	}

}

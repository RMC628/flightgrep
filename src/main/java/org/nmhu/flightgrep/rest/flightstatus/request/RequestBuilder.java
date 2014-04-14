package org.nmhu.flightgrep.rest.flightstatus.request;


public class RequestBuilder {	
	
	private final String baseUrl = "https://api.flightstats.com/flex/";  ;
	private final String airportAPIUrl = "airports/rest/v1/json/";	
	private final String scheduleAPIUrl = "schedules/rest/v1/json/";
	private final String connectionsAPIUrl = "connections/rest/v1/json/";
	
	private final static String appKey = "ea40044ec43d34c602783481923fc919";
	private final static String appId = "f887c2d4";
	
	public RequestBuilder(){
		
	}
	
	
	/* Airport API based methods */
	
	private String buildUrl(String path) {
		
		return this.baseUrl + path + "?appId=" + appId + "&appKey=" + appKey;				
	}	
	
	
	public SearchRequest getAllAirports(){		
		
		return new SearchRequest(this.buildUrl(airportAPIUrl + "countryCode/US"));		
			
	}
	
	public SearchRequest getActiveAirportByDate(String month, String day, String year){
		
		return new SearchRequest(this.buildUrl(this.airportAPIUrl + "active/" + month + "/" + year));		
	}
	
	public SearchRequest getAirportsByCity(String cityCode) {
		
		return new SearchRequest(this.buildUrl(this.airportAPIUrl + "cityCode/" + cityCode));
	
	}
	
	
	public SearchRequest getActiveAirportByCode(String code){
		
		return new SearchRequest(this.buildUrl(this.airportAPIUrl + code + "/today/"));				
	}
	
	/* Schedule API based methods */
	
	
	public SearchRequest getFlightsDepartingOnDate(String carrier, String flightNum, String month, String day, String year){
		
		return new SearchRequest(this.buildUrl(this.scheduleAPIUrl + carrier +
												"/" + flightNum + "/departing" +
												"/" + year + 
												"/" + month +
												"/" + day ));		
		
	}
	
	
	public SearchRequest getFlightsArrivingOnDate(String carrier, String flightNum, String month, String day, String year) {
		
		return new SearchRequest(this.buildUrl(this.scheduleAPIUrl + carrier +
				"/" + flightNum + "/arriving" +
				"/" + year + 
				"/" + month +
				"/" + day ));			
	}
	
	public SearchRequest getFlightsDepartingAirport(String airportCode, String month, String day, String year, String hour) {
		
		return new SearchRequest(this.buildUrl(this.scheduleAPIUrl + "from/" 
											   + airportCode + "/departing/" 
											   + year + "/" + month + "/" + day
											   + "/" + hour));		
		
	}
	
	
	public SearchRequest getFlightsArrivingAirport(String airportCode, String month, String day, String year, String hour) {
		
		return new SearchRequest(this.buildUrl(this.scheduleAPIUrl + "to/" 
											   + airportCode + "/arriving/" 
											   + year + "/" + month + "/" + day
											   + "/" + hour));		
		
	}
	
	public SearchRequest getDepartingFlightsByRoute(String departureAirportCode, String arrivalAirportCode, String month, String day, String year) {
		
		String url = String.format("%sconnecting/from/%s/to/%s/departing/%s/%s/%s", 
									this.connectionsAPIUrl, departureAirportCode, 
									arrivalAirportCode, year, month, day);
		return new SearchRequest(this.buildUrl(url));		
	}
	
	

}

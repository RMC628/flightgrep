package org.nmhu.flightgrep.controller.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;

import org.nmhu.flightgrep.rest.flightstatus.gson.Airline;
import org.nmhu.flightgrep.rest.flightstatus.gson.Airport;
import org.nmhu.flightgrep.rest.flightstatus.gson.Flight;
import org.nmhu.flightgrep.rest.flightstatus.response.ConnResponse;
import org.nmhu.flightgrep.rest.flightstatus.search.SearchGateway;

@ManagedBean
@RequestScoped
public class SearchBean {
	
	private List<Flight> searchResults;	
	private List<String> airports = null;
	
	private HashMap<String, String> imgUrls;
	
	private String fromAirport;
	private String toAirport;
	
	private Date leaveDate;
	private Date returnDate;	
	
	@PostConstruct
	public void init() {		
		
		airports = new ArrayList<String>();
		searchResults = new ArrayList<Flight>();
		
		imgUrls = new HashMap<String,String>();
		
		imgUrls.put("US Airways", "us.gif");
		imgUrls.put("American Airlines", "aa.gif");
		imgUrls.put("United Airlines", "united.gif");
		imgUrls.put("Delta Air Lines", "delta.gif");
		imgUrls.put("Southwest Airlines", "southwest.gif");
		

		String path = System.getenv("OPENSHIFT_DATA_DIR") + "airports.txt";
		File fp = new File(path);
		
		InputStream input = null;
		try {
			input = new FileInputStream(fp);
		} catch (FileNotFoundException e2) {			
			e2.printStackTrace();
		}

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));
		} catch (UnsupportedEncodingException e1) {

			e1.printStackTrace();
		}

		String line = null;

		try {
			while ((line = reader.readLine()) != null) {
				
				airports.add(line);
			}
		} catch (IOException e) {
			LogBean.severe(
					"IOException in AutoCompleteBean init(): " + e.toString());
		} finally {
			
			try {
				reader.close();
				input.close();

			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}
	
	public List<String> complete(String query) {
		List<String> results = new ArrayList<String>();
		
		for (String s : airports) {
			
			if(s.toLowerCase().startsWith(query.toLowerCase(), 0)) {
				results.add(s);
			}			
		}
		return results;
	}	

	public String getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(String selectedValue) {
		fromAirport = selectedValue;				
	}
	
	public String getToAirport() {
		return toAirport;
	}

	public void setToAirport(String selectedValue) {
		toAirport = selectedValue;		
	}

	public String search(){
		
		LogBean.info("Search() method called!");
		
		String day = Integer.toString(leaveDate.getDate());
		String month = Integer.toString(leaveDate.getMonth()+1);
		String year = Integer.toString(leaveDate.getYear()+1900);
			
		String from = fromAirport.substring((fromAirport.indexOf('(')+1), fromAirport.indexOf(')'));
		String to = toAirport.substring((toAirport.indexOf('(')+1), toAirport.indexOf(')'));
				
		ConnResponse response = SearchGateway.getDepartingFlightsByRoute(from, to, month, day, year);
		
		Flight[] flights = response.getFlights();
		Airline[] airlines = response.getAppendix().getAirlines();
		Airport[] airports = response.getAppendix().getAirports();
				
		try {
			for(Flight f : flights){
				for(Flight c : f.getFlightLegs()){
					
					for(Airline a : airlines){
						if(c.getCarrierFsCode().equalsIgnoreCase(a.getFs())){
							a.setLogoUrl(this.getImageUrl(a.getName()));
							c.setAirlineName(a.getName());
							c.setAirline(a);
						}					
					}
					
					for(Airport a : airports) {
						
						if(c.getDepartureAirportFsCode().equalsIgnoreCase(a.getFs())){
							c.setFromAirport(a);
						} 
						
						if(c.getArrivalAirportFsCode().equalsIgnoreCase(a.getFs())){
							c.setToAirport(a);
						}					
					}
					
				}			
			}
		} catch (Exception e) {			
			return "index";
		}
		
		
		if (flights.length > 0) {
			searchResults = Arrays.asList(flights);
		}	
		return"results";
	}	
	
	public List<Flight> getResults(){					
		return searchResults;		
	}	
	
	public void setResults(List<Flight> list){		
		searchResults = list;	
	}
	
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public String getImageUrl(String airline){
		
		return imgUrls.get(airline);		
	}
	
	
}

package org.nmhu.flightgrep.rest.flightstatus.gson;

import org.nmhu.flightgrep.controller.bean.LogBean;

public class Flight {

	private String carrierFsCode;
	private String flightNumber;
	private String airlineName;
	private String brand;
	private String departureAirportFsCode;
	private String arrivalAirportFsCode;
	private String departureDateFrom;
	private String departureDateTo;
	private Integer[] departureDaysOfWeek;
	private Integer arrivalDateAdjustment;
	private Integer distanceMiles;
	private Integer flightDurationMinutes;
	private Integer layoverDurationMinutes;
	private Integer flightDurationHours;
	private Integer layoverDurationHours;
	private String flightType;
	private Boolean online;
	private Flight[] flightLegs;
	private String stops;
	private Airline airline;
	private String departureTerminal;
	private String arrivalTerminal;
	private String departureTime;
	private String arrivalTime;
	private String flightEquipmentIataCode;
	private Boolean isCodeShare;
	private Boolean isWetlease;
	private String serviceType;
	private String[] serviceClasses;
	private String[] trafficRestrictions;
	private String referenceCode;

	private Airport fromAirport;
	private Airport toAirport;

	private String fromAirportName;
	private String toAirportName;
	
	
	public String getFromAirportName() {
		return fromAirportName;
	}

	public void setFromAirportName(String fromAirportName) {
		this.fromAirportName = fromAirportName;
	}

	public String getToAirportName() {
		return toAirportName;
	}

	public void setToAirportName(String toAirportName) {
		this.toAirportName = toAirportName;
	}

	public String getAirlineName() {		
		return airlineName;
	}

	public void setAirlineName(String name) {
		this.airlineName = name;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public String getFromName() {
		return fromAirport.getName();
	}

	public String getToName() {
		return toAirport.getName();
	}
	
	
	public String getFromCity() {
		return fromAirport.getCity();
	}

	public String getToCity() {
		return toAirport.getCity();
	}

	public String getFromState() {
		return fromAirport.getStateCode();
	}

	public String getToState() {
		return toAirport.getStateCode();
	}

	public Airport getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(Airport fromAirport) {
		this.fromAirport = fromAirport;
	}

	public Airport getToAirport() {
		return toAirport;
	}

	public void setToAirport(Airport toAirport) {
		this.toAirport = toAirport;
	}

	public String getDepartureDateFrom() {
		return departureDateFrom;
	}

	public void setDepartureDateFrom(String departureDateFrom) {
		this.departureDateFrom = departureDateFrom;
	}

	public String getDepartureDateTo() {
		return departureDateTo;
	}

	public void setDepartureDateTo(String departureDateTo) {
		this.departureDateTo = departureDateTo;
	}

	public Integer[] getDepartureDaysOfWeek() {
		return departureDaysOfWeek;
	}

	public void setDepartureDaysOfWeek(Integer[] departureDaysOfWeek) {
		this.departureDaysOfWeek = departureDaysOfWeek;
	}

	public Integer getArrivalDateAdjustment() {
		return arrivalDateAdjustment;
	}

	public void setArrivalDateAdjustment(Integer arrivalDateAdjustment) {
		this.arrivalDateAdjustment = arrivalDateAdjustment;
	}

	public Integer getDistanceMiles() {
		return distanceMiles;
	}

	public void setDistanceMiles(Integer distanceMiles) {
		this.distanceMiles = distanceMiles;
	}

	public Integer getFlightDurationMinutes() {
		this.flightDurationMinutes %= 60;
		return flightDurationMinutes;
	}

	public void setFlightDurationMinutes(Integer flightDurationMinutes) {
		this.flightDurationMinutes = flightDurationMinutes;
	}

	public Integer getLayoverDurationMinutes() {
		return layoverDurationMinutes %= 60;
	}

	public void setLayoverDurationMinutes(Integer layoverDurationMinutes) {
		this.layoverDurationMinutes = layoverDurationMinutes;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public Boolean getOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public Flight[] getFlightLegs() {
		return flightLegs;
	}

	public void setFlightLegs(Flight[] flightLegs) {
		this.flightLegs = flightLegs;
	}

	public void setCarrierFsCode(String carrierFsCode) {
		this.carrierFsCode = carrierFsCode;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setDepartureAirportFsCode(String departureAirportFsCode) {
		this.departureAirportFsCode = departureAirportFsCode;
	}

	public void setArrivalAirportFsCode(String arrivalAirportFsCode) {
		this.arrivalAirportFsCode = arrivalAirportFsCode;
	}

	public void setStops(String stops) {
		this.stops = stops;
	}

	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setFlightEquipmentIataCode(String flightEquipmentIataCode) {
		this.flightEquipmentIataCode = flightEquipmentIataCode;
	}

	public void setIsCodeShare(Boolean isCodeShare) {
		this.isCodeShare = isCodeShare;
	}

	public void setIsWetlease(Boolean isWetlease) {
		this.isWetlease = isWetlease;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void setServiceClasses(String[] serviceClasses) {
		this.serviceClasses = serviceClasses;
	}

	public void setTrafficRestrictions(String[] trafficRestrictions) {
		this.trafficRestrictions = trafficRestrictions;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public Flight() {
	}

	public String toString() {

		return "Flight Number: " + this.flightNumber + "\n"
				+ "Departing From: " + this.departureAirportFsCode + "\n"
				+ "Departure Terminal: " + this.departureTerminal + "\n"
				+ "Departure Time: " + this.departureTime + "\n"
				+ "Arriving At: " + this.arrivalAirportFsCode + "\n"
				+ "Arrival Terminal: " + this.arrivalTerminal + "\n"
				+ "Arrival Time: " + this.arrivalTime;

	}

	public String getCarrierFsCode() {
		return carrierFsCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getDepartureAirportFsCode() {
		return departureAirportFsCode;
	}

	public String getArrivalAirportFsCode() {
		return arrivalAirportFsCode;
	}

	public String getStops() {
		return stops;
	}

	public String getDepartureTerminal() {
		return departureTerminal;
	}

	public String getArrivalTerminal() {
		return arrivalTerminal;
	}

	public String getDepartureTime() {
		
		return formatTime(departureTime);
	}

	public String getArrivalTime() {
		return formatTime(arrivalTime);
		
	}

	private String formatTime(String time){
		
		String[] tokens = time.split(":");
		
		if(tokens.length >= 2) {
			int hours = Integer.parseInt(tokens[0]);
			int mins = Integer.parseInt(tokens[1]);
			if(hours > 12){
				hours -= 12;
				return String.format("%d:%02d PM", hours, mins);
			} else {
				return String.format("%d:%02d AM", hours, mins);
			}
		
		} else {
			return "HH:MM";
		}
		
		
	}
	
	public String getFlightEquipmentIataCode() {
		return flightEquipmentIataCode;
	}

	public Boolean getIsCodeShare() {
		return isCodeShare;
	}

	public Boolean getIsWetlease() {
		return isWetlease;
	}

	public String getServiceType() {
		return serviceType;
	}

	public String[] getServiceClasses() {
		return serviceClasses;
	}

	public String[] getTrafficRestrictions() {
		return trafficRestrictions;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getFlightDurationHours() {

		Integer hours = (this.flightDurationMinutes / 60);
		return hours;
	}

	public void setFlightDurationHours(Integer flightDurationHours) {
		this.flightDurationHours = flightDurationHours;
	}

	public Integer getLayoverDurationHours() {
		return layoverDurationHours;
	}

	public void setLayoverDurationHours(Integer layoverDurationHours) {
		this.layoverDurationHours = layoverDurationHours;
	}

}

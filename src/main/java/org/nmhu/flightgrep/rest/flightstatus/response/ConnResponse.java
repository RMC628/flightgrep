package org.nmhu.flightgrep.rest.flightstatus.response;

import org.nmhu.flightgrep.rest.flightstatus.gson.Airport;
import org.nmhu.flightgrep.rest.flightstatus.gson.Appendix;
import org.nmhu.flightgrep.rest.flightstatus.gson.Arrival;
import org.nmhu.flightgrep.rest.flightstatus.gson.Carrier;
import org.nmhu.flightgrep.rest.flightstatus.gson.CodeType;
import org.nmhu.flightgrep.rest.flightstatus.gson.Date;
import org.nmhu.flightgrep.rest.flightstatus.gson.Days;
import org.nmhu.flightgrep.rest.flightstatus.gson.Departure;
import org.nmhu.flightgrep.rest.flightstatus.gson.Equipment;
import org.nmhu.flightgrep.rest.flightstatus.gson.Flight;

public class ConnResponse {	

	private Departure departure;
	private Arrival arrival;
	private Date date;
	private Days days;
	private Carrier[] carriers;
	private String[] allowedConnections;
	private String[] excludedConnections;
	private String connectionType;
	private String codeshareType;
	private CodeType codeType;
	private String serviceType;
	private String flightType;
	private String extendedOptions;
	private String url;
	private Appendix appendix;
	private Airport[] airports;
	private Equipment[] equipments;
	private Flight[] flights;
	
	public Departure getDeparture() {
		return departure;
	}
	public void setDeparture(Departure departure) {
		this.departure = departure;
	}
	public Arrival getArrival() {
		return arrival;
	}
	public void setArrival(Arrival arrival) {
		this.arrival = arrival;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Days getDays() {
		return days;
	}
	public void setDays(Days days) {
		this.days = days;
	}
	public Carrier[] getCarriers() {
		return carriers;
	}
	public void setCarriers(Carrier[] carriers) {
		this.carriers = carriers;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	public String getCodeshareType() {
		return codeshareType;
	}
	public void setCodeshareType(String codeshareType) {
		this.codeshareType = codeshareType;
	}
	public CodeType getCodeType() {
		return codeType;
	}
	public void setCodeType(CodeType codeType) {
		this.codeType = codeType;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getExtendedOptions() {
		return extendedOptions;
	}
	public void setExtendedOptions(String extendedOptions) {
		this.extendedOptions = extendedOptions;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Appendix getAppendix() {
		return appendix;
	}
	public void setAppendix(Appendix appendix) {
		this.appendix = appendix;
	}
	public Airport[] getAirports() {
		return airports;
	}
	public void setAirports(Airport[] airports) {
		this.airports = airports;
	}
	public Equipment[] getEquipments() {
		return equipments;
	}
	public void setEquipments(Equipment[] equipments) {
		this.equipments = equipments;
	}
	public Flight[] getFlights() {
		return flights;
	}
	public void setFlights(Flight[] flights) {
		this.flights = flights;
	}
	public String[] getAllowedConnections() {
		return allowedConnections;
	}
	public void setAllowedConnections(String[] allowedConnections) {
		this.allowedConnections = allowedConnections;
	}
	public String[] getExcludedConnections() {
		return excludedConnections;
	}
	public void setExcludedConnections(String[] excludedConnections) {
		this.excludedConnections = excludedConnections;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	
}

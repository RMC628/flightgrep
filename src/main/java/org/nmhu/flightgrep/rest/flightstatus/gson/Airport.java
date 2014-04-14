package org.nmhu.flightgrep.rest.flightstatus.gson;

public class Airport {
	
		
	private String fs;
	private String iata;
	private String icao;
	private String faa;
	private String name;
	private String street1;
	private String city;
	private String cityCode;
	private String stateCode;
	private String postalCode;
	private String countryCode;
	private String countryName;
	private String regionName;
	private String timeZoneRegionName;
	private String weatherZone;
	private String localTime;
	private Double utcOffsetHours;
	private Double latitude;
	private Double longitude;
	private Integer elevationFeet;
	private Integer classification;
	private Boolean active;
	private String delayIndexUrl;
	private String weatherUrl;
	
		
	public String getFs() {
		return fs;
	}

	public void setFs(String fs) {
		this.fs = fs;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getFaa() {
		return faa;
	}

	public void setFaa(String faa) {
		this.faa = faa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getTimeZoneRegionName() {
		return timeZoneRegionName;
	}

	public void setTimeZoneRegionName(String timeZoneRegionName) {
		this.timeZoneRegionName = timeZoneRegionName;
	}

	public String getWeatherZone() {
		return weatherZone;
	}

	public void setWeatherZone(String weatherZone) {
		this.weatherZone = weatherZone;
	}

	public String getLocalTime() {
		return localTime;
	}

	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}

	public Double getUtcOffsetHours() {
		return utcOffsetHours;
	}

	public void setUtcOffsetHours(Double utcOffsetHours) {
		this.utcOffsetHours = utcOffsetHours;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getElevationFeet() {
		return elevationFeet;
	}

	public void setElevationFeet(Integer elevationFeet) {
		this.elevationFeet = elevationFeet;
	}

	public Integer getClassification() {
		return classification;
	}

	public void setClassification(Integer classification) {
		this.classification = classification;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getDelayIndexUrl() {
		return delayIndexUrl;
	}

	public void setDelayIndexUrl(String delayIndexUrl) {
		this.delayIndexUrl = delayIndexUrl;
	}

	public String getWeatherUrl() {
		return weatherUrl;
	}

	public void setWeatherUrl(String weatherUrl) {
		this.weatherUrl = weatherUrl;
	}

	@Override
    public String toString() {
        return this.name + " - (" + this.fs + ")";
    }
	
	

}

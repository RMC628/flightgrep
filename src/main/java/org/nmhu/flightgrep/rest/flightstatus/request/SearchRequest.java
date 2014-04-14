package org.nmhu.flightgrep.rest.flightstatus.request;

public class SearchRequest {

	private String url;			
	
	protected SearchRequest(){}
	
	protected SearchRequest(String url){
		this.url = url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return this.url;		
	}
	
	public String toString(){		
		return this.url;	
	}	
	
}

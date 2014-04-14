package org.nmhu.flightgrep.rest.flightstatus.searchengine;

import org.nmhu.flightgrep.controller.bean.LogBean;
import org.nmhu.flightgrep.rest.flightstatus.request.SearchRequest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import java.io.IOException;
import java.util.logging.*;


public class SearchEngine {			
	
	public static String execute(SearchRequest request){		
		
			LogBean.info("Executing request:" + request.toString());
			try {
				ClientConfig config = new DefaultClientConfig(); 
				Client client = Client.create(config);			
							
				WebResource resource = client.resource(request.toString()); 
				String response = resource.get(String.class);				
				
				// LogBean.info("Got Response:" + response);
				
				return response;
			} catch (UniformInterfaceException e) {				
				e.printStackTrace();
			} catch (ClientHandlerException e) {				
				e.printStackTrace();
			}		
		
		
		return null;		
		
		
	};	
		
		
		
	
	
	
	
}

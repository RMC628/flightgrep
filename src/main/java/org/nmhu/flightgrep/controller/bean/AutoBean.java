package org.nmhu.flightgrep.controller.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AutoBean {

	private String selectedValue;

	
	
	public AutoBean() {
		airports = new ArrayList<String>();		
	}

	
	private List<String> airports;
	
	@PostConstruct
	public void init() {		

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/* public List<String> complete(String query) {
		
		LogBean.severe("complete() method called!", AutoBean.class);
		
		List<String> results = new ArrayList<String>();

		for (String s : this.airports) {

			if (s.startsWith(query, 0)) {
				results.add(s);
			}
		}

		return results;
	}
	*/
	
	
	public List<String> complete(String query) {
		List<String> results = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			results.add(query + i);
		}

		return results;
	}
	
	
	public String getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}

}

package org.nmhu.flightgrep.controller.bean;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LogBean {
	
	Logger log;
		
	public LogBean() {
		
	}
	
	public static void info(String msg) {
		
		Logger.getLogger(LogBean.class.getName()).info(msg);				
		
	}
	
	public static void warning(String msg){
		
		Logger.getLogger(LogBean.class.getName()).warning(msg);				
		
	}
	
	public static void severe(String msg) {
		
		Logger.getLogger(LogBean.class.getName()).severe(msg);				
		
	}

}

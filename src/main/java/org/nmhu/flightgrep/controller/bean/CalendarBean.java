package org.nmhu.flightgrep.controller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import java.util.Date;


@ManagedBean
@ViewScoped
public class CalendarBean {

	
	private Date leaveDate;
	private Date returnDate;
	
	
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
	
	
	
		
	
	
	
	
}

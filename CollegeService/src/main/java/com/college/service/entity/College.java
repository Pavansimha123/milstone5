package com.college.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long collegeid;
	private String collegename;
	private long totalnumofstudents;
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(long collegeid, String collegename, long totalnumofstudents) {
		super();
		this.collegeid = collegeid;
		this.collegename = collegename;
		this.totalnumofstudents = totalnumofstudents;
	}

	public long getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(long collegeid) {
		this.collegeid = collegeid;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public long getTotalnumofstudents() {
		return totalnumofstudents;
	}

	public void setTotalnumofstudents(long totalnumofstudents) {
		this.totalnumofstudents = totalnumofstudents;
	}
	

}

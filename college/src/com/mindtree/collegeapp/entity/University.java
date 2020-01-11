package com.mindtree.collegeapp.entity;

public class University {
	
	private int univId;
	private String univName;
	public University() {
		super();
		
	}
	public University(int univId, String univName) {
		super();
		this.univId = univId;
		this.univName = univName;
	}
	public int getUnivId() {
		return univId;
	}
	public void setUnivId(int univId) {
		this.univId = univId;
	}
	public String getUnivName() {
		return univName;
	}
	public void setUnivName(String univName) {
		this.univName = univName;
	}
	@Override
	public String toString() {
		return "University [univId=" + univId + ", univName=" + univName + "]";
	}

	}



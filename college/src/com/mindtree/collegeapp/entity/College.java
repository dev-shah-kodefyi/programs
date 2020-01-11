package com.mindtree.collegeapp.entity;

public class College {
	private String collegeName;
	private int collegeId;
	private int universityId;
	private int rating;
	public College() {
		super();
		
	}
	public College(String collegeName, int collegeId, int universityId, int rating) {
		super();
		this.collegeName = collegeName;
		this.collegeId = collegeId;
		this.universityId = universityId;
		this.rating = rating;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	}



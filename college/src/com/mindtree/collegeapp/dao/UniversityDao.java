package com.mindtree.collegeapp.dao;

import java.util.List;

import com.mindtree.collegeapp.entity.College;
import com.mindtree.collegeapp.entity.University;


public interface UniversityDao {

	String insertUniversity(int univId, String univName);

	List<University> getUniv();

	List<College> getCollege(int univId);

	

}

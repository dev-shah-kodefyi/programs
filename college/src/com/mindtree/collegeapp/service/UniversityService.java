package com.mindtree.collegeapp.service;

import java.util.List;

import com.mindtree.collegeapp.entity.College;
import com.mindtree.collegeapp.entity.University;
import com.mindtree.collegeapp.exception.NoDuplicateUniversity;



public interface UniversityService {
University insertValue(int univId, String univName) throws NoDuplicateUniversity;

List<University> getUniversity();

List<College> details(int univId);

//Object details(int univId);
	

}

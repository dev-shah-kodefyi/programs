package com.mindtree.collegeapp.service;

import java.util.List;

import com.mindtree.collegeapp.entity.College;

public interface CollegeService {

	College addCollege(int univId, int collegeId, String collegeName, int rating);
		

}

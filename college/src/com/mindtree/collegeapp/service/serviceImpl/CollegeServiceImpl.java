package com.mindtree.collegeapp.service.serviceImpl;

import java.util.List;

import com.mindtree.collegeapp.dao.CollegeDao;
import com.mindtree.collegeapp.dao.daoImpl.CollegeDaoImpl;
import com.mindtree.collegeapp.entity.College;
import com.mindtree.collegeapp.service.CollegeService;

public class CollegeServiceImpl implements CollegeService {
CollegeDao collegedao=new CollegeDaoImpl(); 
	
	@Override
	public College addCollege(int univId, int collegeId, String collegeName, int rating) {
		String message=this.collegedao.addCollege(univId, collegeId, collegeName, rating);
		return null;
	}

}

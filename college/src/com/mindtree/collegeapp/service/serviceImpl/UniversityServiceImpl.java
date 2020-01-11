package com.mindtree.collegeapp.service.serviceImpl;

import java.util.List;

import com.mindtree.collegeapp.dao.UniversityDao;
import com.mindtree.collegeapp.dao.daoImpl.UniversityDaoImpl;
import com.mindtree.collegeapp.entity.College;
import com.mindtree.collegeapp.entity.University;
import com.mindtree.collegeapp.exception.NoDuplicateUniversity;
import com.mindtree.collegeapp.service.UniversityService;


public class UniversityServiceImpl implements UniversityService  {
	UniversityDao univdao=new UniversityDaoImpl();
	
	
	boolean flag=true;
	public University insertValue(int univId, String univName) throws NoDuplicateUniversity {
		List<University>list3=null;
		list3 =this.univdao.getUniv();
		 
		 
		for(University list:list3)
		{
			if(list.getUnivName().equals(univName))
			{
			flag=false;
			break;}}
		
		if(flag==true) {
		String message=this.univdao.insertUniversity(univId,univName);
		System.out.println("hi");}
		else
		{
			throw new NoDuplicateUniversity(" No Duplicate University Allowed");
		}
	
		return null;
	
	
	}
    public List<University> getUniversity() {
	
		List<University>list1=null;
		list1=this.univdao.getUniv();
		return list1;
	}
	@Override
	public List<College> details(int univId) {
		List<College>list2=null;
		list2=this.univdao.getCollege(univId);
		return list2;
	}

	

}


;
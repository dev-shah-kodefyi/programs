package com.mindtree.collegeapp.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mindtree.collegeapp.entity.College;
import com.mindtree.collegeapp.entity.University;
import com.mindtree.collegeapp.exception.NoDuplicateUniversity;
import com.mindtree.collegeapp.service.CollegeService;
import com.mindtree.collegeapp.service.UniversityService;
import com.mindtree.collegeapp.service.serviceImpl.CollegeServiceImpl;
import com.mindtree.collegeapp.service.serviceImpl.UniversityServiceImpl;

public class AppRunner {

	public static void main(String[] args) throws NoDuplicateUniversity {
		Scanner sc = new Scanner(System.in);
		University university = new University();
		 College college=new College();
		boolean flag = false;
		CollegeService collegeservice = new CollegeServiceImpl();
		List<University> univlist = new ArrayList<University>();
		List<College>collegelist=new ArrayList<College>();
       // CollegeService clgservice=new CollegeServiceImpl();
        
		UniversityService univservice = new UniversityServiceImpl();
		while (true) {
			System.out.println(
					"1. To register university\n 2.Register a college \n 3.Display all the colleges under a university");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("Enter the university Id");
				int univId = sc.nextInt();
				System.out.println("Enter the university Name");
				String univName = sc.next();

				university = univservice.insertValue(univId, univName);

				break;

			case 2:

				univlist = univservice.getUniversity();
				System.out.println(univlist);
                System.out.println("Enter the university id");
                int univId1=sc.nextInt();
                System.out.println("Enter the college id");
                int collegeId=sc.nextInt();
                System.out.println("Enter the college name");
                String collegeName=sc.next();
                System.out.println("Enter the college rating");
                int rating=sc.nextInt();
                college=collegeservice.addCollege(univId1,collegeId,collegeName,rating);
                break;
                
			case 3:
				System.out.println("Enter a University id");
                int uId=sc.nextInt();
                collegelist= univservice.details(uId);
                
                break;
                
			}
		}
	}

}

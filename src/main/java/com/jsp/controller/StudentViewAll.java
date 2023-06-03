package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentViewAll {

public static void main(String[] args) {
		
		StudentService service=new StudentService();
		
	    List<Student> li=service.viewAllStudent();
	    
	    for (Student s : li) 
	    {
			System.out.println(s.getId()+" "+s.getName()+" "+s.getCourse());
		}
	}
}

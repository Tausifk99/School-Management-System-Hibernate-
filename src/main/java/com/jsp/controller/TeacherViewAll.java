package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TeacherViewAll {

	public static void main(String[] args) {
		
		TeacherService service=new TeacherService();
		
	    List<Teacher> li=service.viewAllTeacher();
	    
	    for (Teacher t : li) 
	    {
			System.out.println(t.getId()+" "+t.getName()+" "+t.getSubject());
		}
	}
}

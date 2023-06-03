package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TeacherUpdate {

	public static void main(String[] args) {
		
			TeacherService service=new TeacherService();
			
			Teacher t1=service.updateTeacherName(4, "Neeraj Sir");
			Teacher t2=service.updateTeacherSubject(4, "Java Specialist");
			System.out.println(t1.getName()+" updated");
			System.out.println(t2.getSubject()+" updated");
			
		}
	
}

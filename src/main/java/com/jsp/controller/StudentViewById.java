package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentViewById {

   public static void main(String[] args) {
		
		StudentService service=new StudentService();
		
		Student s=service.viewStudentById(2);
		
		System.out.println(s.getId()+" "+s.getName()+" "+s.getCourse());
	}
}

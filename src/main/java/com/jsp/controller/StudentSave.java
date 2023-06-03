package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentSave {

public static void main(String[] args) {
		
		StudentService service=new StudentService();
		
		Student student=new Student();
		student.setName("Shambhu");
		student.setCourse("Software developer");
		
	    Student	s=service.saveStudent(student);
	    
	    System.out.println(s.getName()+" saved successfully");
		
	}
}

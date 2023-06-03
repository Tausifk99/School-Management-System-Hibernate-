package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class StudentUpdate {

	public static void main(String[] args) {
		
		StudentService service=new StudentService();
		
		Student student1=service.updateStudentName(4, "shambhoo");
		Student student2=service.updateStudentCourse(4, "Java");
		System.out.println(student1.getName()+" updated");
		System.out.println(student2.getCourse()+" updated");
		
	}
}

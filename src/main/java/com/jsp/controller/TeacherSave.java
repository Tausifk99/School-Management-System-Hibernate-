package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TeacherSave {

	public static void main(String[] args) {
		
		TeacherService service=new TeacherService();
		
		Teacher teacher=new Teacher();
		teacher.setName("Neeraj Sir");
		teacher.setSubject("Java");
		
	    Teacher	t=service.saveTeacher(teacher);
	    
	    System.out.println(t.getName()+" saved successfully");
		
	}
}

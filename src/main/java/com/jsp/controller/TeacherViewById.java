package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TeacherViewById {

	public static void main(String[] args) {
		
		TeacherService service=new TeacherService();
		
		Teacher t=service.viewTeacherById(2);
		
		System.out.println(t.getId()+" "+t.getName()+" "+t.getSubject());
	}
}

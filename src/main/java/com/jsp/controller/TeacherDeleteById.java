package com.jsp.controller;

import com.jsp.service.TeacherService;

public class TeacherDeleteById {

	public static void main(String[] args) {
		
		TeacherService service=new TeacherService();
		
		boolean b=service.deleteTeacherById(3);
		
		if(b==true)
		{
			System.out.println("Deleted Successfully");
		}else
		{
			System.out.println("Incorrect Id");
		}
	}
}

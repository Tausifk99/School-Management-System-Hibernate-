package com.jsp.controller;

import com.jsp.service.StudentService;

public class StudentDeleteById {

	
public static void main(String[] args) {
		
		StudentService service=new StudentService();
		
		boolean b=service.deleteStudentById(3);
		
		if(b==true)
		{
			System.out.println("Deleted Successfully");
		}else
		{
			System.out.println("Incorrect Id");
		}
	}
}

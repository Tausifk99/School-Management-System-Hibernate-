package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {

      StudentDao sdao=new StudentDao();
	
      //save
	public Student saveStudent(Student student)
	{
		if(student!=null)
		{
			return sdao.saveStudent(student);
		}else
		{
			return null;
		}
	}
	//delete
	public boolean deleteStudentById(int id)
	{
		if(id>0)
		{
			return sdao.deleteStudentById(id);
		}else
		{
			return false;
		}
	}
	
	//view by id
	public Student viewStudentById(int id)
	{
		if(id>0)
		{
			return sdao.viewStudentById(id);
		}else
		{
			return null;
		}
	}
	
	//update student name
	public Student updateStudentName(int id,String name)
	{
		Student s=sdao.viewStudentById(id);
		if(s!=null)
		s.setName(name);
		return sdao.updateStudentName(id,s);
	}
	
	//update student course
	
	public Student updateStudentCourse(int id,String course)
	{
		Student s=sdao.viewStudentById(id);
		if(s!=null)
		s.setCourse(course);
		return sdao.updateStudentCourse(id,s);
	}
	
	//get all student
	public List<Student> viewAllStudent()
	{
		return sdao.viewAllStudent();
	}
	

}

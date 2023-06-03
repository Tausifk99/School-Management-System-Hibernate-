package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {

	TeacherDao tdao=new TeacherDao();
	//save
	public Teacher saveTeacher(Teacher teacher)
	{
		if(teacher!=null)
		{
			return tdao.saveTeacher(teacher);
		}else
		{
			return null;
		}
	}
	
	//delete
	public boolean deleteTeacherById(int id)
	{
		if(id>0)
		{
			return tdao.deleteTeacherById(id);
		}else
		{
			return false;
		}
	}

	//view by id
	public Teacher viewTeacherById(int id)
	{
		if(id>0)
		{
			return tdao.viewTeacherById(id);
		}else
		{
			return null;
		}
	}
	
	
	//update name 
	public Teacher updateTeacherName(int id,String name)
	{
		Teacher t=tdao.viewTeacherById(id);
		if(t!=null)
		t.setName(name);
		return tdao.updateTeacherName(id,t);
	}
	
	//update subject
	public Teacher updateTeacherSubject(int id,String subject)
	{
		Teacher t=tdao.viewTeacherById(id);
		if(t!=null)
		t.setSubject(subject);
		return tdao.updateTeacherName(id,t);
	}
	
	//get all teacher
	
	public List<Teacher> viewAllTeacher()
	{
		return tdao.viewAllTeacher();
	}


}

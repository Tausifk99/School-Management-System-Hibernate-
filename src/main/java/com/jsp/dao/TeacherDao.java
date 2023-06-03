package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tausif");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//save
	public Teacher saveTeacher(Teacher teacher)
	{
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		
		return teacher;
	}
	
	//delete
	public boolean deleteTeacherById(int id)
	{
		entityTransaction.begin();
		Teacher t=entityManager.find(Teacher.class, id);
		entityManager.remove(t);
		entityTransaction.commit();
		return true;
	}
	
	//view by id
	public Teacher viewTeacherById(int id)
	{
		return entityManager.find(Teacher.class, id);
	}
	
	//update name
	public Teacher updateTeacherName(int id,Teacher teacher)
	{
		if(teacher!=null)
		{
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}else
		{
			return null;
		}
	}
	
	//update teacher subject
	
	public Teacher updateTeacherCourse(int id,Teacher teacher)
	{
		if(teacher!=null)
		{
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}else
		{
			return null;
		}
	}
	
	//get all teacher
	public List<Teacher> viewAllTeacher()
	{
		String jpql="select t from Teacher t";
		Query query=entityManager.createQuery(jpql);
		List<Teacher> li=query.getResultList();
		if(!li.isEmpty())
		{
			return li;
		}else
		{
			return null;
		}
	}
	
	
	
}

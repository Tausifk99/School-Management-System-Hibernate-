package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tausif");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//save
	public Student saveStudent(Student student)
	{
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	
	//delete
	public boolean deleteStudentById(int id)
	{
		entityTransaction.begin();
		Student s=entityManager.find(Student.class, id);
		entityManager.remove(s);
		entityTransaction.commit();
		return true;
	}
	
	//view by id
	public Student viewStudentById(int id)
	{
		return entityManager.find(Student.class, id);
	}
	
	//update Student name
	
	public Student updateStudentName(int id,Student student)
	{
		if(student!=null)
		{
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}else
		{
			return null;
		}
	}
	
	//update student course
	public Student updateStudentCourse(int id,Student student)
	{
		if(student!=null)
		{
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}else
		{
			return null;
		}
	}
	
	//get all student
	
	public List<Student> viewAllStudent()
	{
		String jpql="select s from Student s";
		Query query=entityManager.createQuery(jpql);
		List<Student> li=query.getResultList();
		if(!li.isEmpty())
		{
			return li;
		}else
		{
			return null;
		}
	}
}

package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Student;

@Repository
public interface StudentDao {
	
	public void insert(Student s);
	public void update(Student s);
	public void delete(String f);
	public List<Student> getAll();

}

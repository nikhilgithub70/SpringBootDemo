package com.sts.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Serializable> {
	
	public Student findById(Integer id);

}

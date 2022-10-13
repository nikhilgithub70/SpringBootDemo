package com.sts.service;

import com.sts.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getStudentById(Integer id);
	public void deleteStudentById(Integer id);

}

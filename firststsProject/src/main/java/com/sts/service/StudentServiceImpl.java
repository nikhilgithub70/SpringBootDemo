package com.sts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.dao.StudentRepo;
import com.sts.entity.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
		
	}

	@Override
	public Student getStudentById(Integer id) {
          return studentRepo.findById(id);
		
	}

	@Override
	public void deleteStudentById(Integer id) {
	studentRepo.deleteById(id);
		
	}

	
}

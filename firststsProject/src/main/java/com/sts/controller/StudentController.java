package com.sts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.entity.Student;
import com.sts.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stud){
		Student student=studentService.saveStudent(stud);
		return ResponseEntity.ok().body(student);
	}
	@GetMapping("/getdata/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id")Integer id){
		Student student=studentService.getStudentById(id);
		return ResponseEntity.ok().body(student);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable("id")Integer id) {
		studentService.deleteStudentById(id);
	}

}

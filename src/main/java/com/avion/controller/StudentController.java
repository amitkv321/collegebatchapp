package com.avion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avion.model.StudentDetails;
import com.avion.service.StudentService;

@RestController
@RequestMapping("studentdata")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("students")
	public List<?> getAllBatchDetails() {
		return studentService.getCompleteStudentDetails();
	}
	
	@PostMapping("students")
	public StudentDetails addStudents(@RequestBody StudentDetails studentDetails) {
		return studentService.addStudent(studentDetails);
	}
	
}

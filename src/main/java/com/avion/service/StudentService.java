package com.avion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avion.dao.StudentDao;
import com.avion.model.StudentDetails;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;

	public List<?> getCompleteStudentDetails() {
		List<StudentDetails> studentDetailsList = new ArrayList<>();
		studentDao.findAll().forEach(studentDetailsList::add);
		return studentDetailsList;
	}

	public StudentDetails addStudent(StudentDetails studentDetails) {
		return studentDao.save(studentDetails);
	}
	
	

}

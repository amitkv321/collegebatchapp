package com.avion.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class StudentDetails {

	@Id
	int studentId;
	
	String studentName;
	Date dob;
	
	@OneToOne(cascade=CascadeType.ALL)
	Education educationDetails;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	List<BatchDetails> batchDetails;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Education getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(Education educationDetails) {
		this.educationDetails = educationDetails;
	}

	public List<BatchDetails> getBatchDetails() {
		return batchDetails;
	}

	public void setBatchDetails(List<BatchDetails> batchDetails) {
		this.batchDetails = batchDetails;
	}
	
}

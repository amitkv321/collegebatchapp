package com.avion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EDUCATION_DETAILS")
public class Education {
	
	@Id
	@GeneratedValue
	int eduId;

}

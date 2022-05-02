package com.te.learningmanagementsystem.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int experienceInfoId;
	
	private String companyName;
	
	@Column(name="No_Of_Experience")
	private int noofexp;
	
	@Column(name="Date_Of_Joining")
	private Date doj;
	
	@Column(name="Date_Of_Relieving")
	private Date dor;
	
	private String designation;
	
	private String location;
}

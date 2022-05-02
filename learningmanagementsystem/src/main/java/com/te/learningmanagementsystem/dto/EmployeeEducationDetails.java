package com.te.learningmanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeEducationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int educationInfoId;
	
	private String educationType;
	
	@Column(name="Year_Of_Passing")
	private String yop;
	
	private String universityName;
	
	private int percentage;
	
	private String instituteName;
	
	private String specialization;
	
	private String state; 
}

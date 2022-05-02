package com.te.learningmanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeTechnicalSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int technicalId;
	
	private String skillsTypes;
	
	private String skillsRating;
	
	@Column(name="Year_Of_Experience")
	private int yoexp;
}

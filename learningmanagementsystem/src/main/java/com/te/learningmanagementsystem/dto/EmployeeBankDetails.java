package com.te.learningmanagementsystem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankInfoId;
	
	private int accountNo;
	
	private String bankName;
	
	private String bankType;
	
	private int ifceCode;
	
	private String branch;
	
	private String state;
}

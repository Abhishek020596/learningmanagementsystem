package com.te.learningmanagementsystem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmployeeAddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressInfoId;
	
	private String addressType;
	
	private int doorNo;
	
	private String street;
	
	private String locality;
	
	private String city;
	
	private String state;
	
	private int pinCode;
	
	private String landMark;
}

package com.te.learningmanagementsystem.dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class EmployeePrimaryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	private String employeeName;
	
	@Column(name="Date_Of_Joining")
	private Date doj;
	
	@Column(name="Date_Of_Birth")
	private Date dob;
	
	private String emailId; 
	
	private String bloodGroup;
	
	private String designation;
	
	private String gender;
	
	private String nationality;
	
	private String martialStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="secondary_Info", referencedColumnName = "secondaryInfoId")
	private EmployeeSecondaryInfo employeesecondaryinfo;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_Id", referencedColumnName = "employeeId")
	private List<EmployeeAddressDetails> employeeAddressDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bank_Details", referencedColumnName = "bankInfoId")
	private EmployeeBankDetails employeeBankDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_Id", referencedColumnName = "employeeId")
	private List<EmployeeContact> employeeContacts;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_Id", referencedColumnName = "employeeId")
	private List<EmployeeEducationDetails> employeeEducationDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_Id", referencedColumnName = "employeeId")
	private List<EmployeeExperience> employeeExperiences;
	 
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_Id", referencedColumnName = "employeeId")
	private List<EmployeeTechnicalSkills> employeeTechnicalSkills;
	
}

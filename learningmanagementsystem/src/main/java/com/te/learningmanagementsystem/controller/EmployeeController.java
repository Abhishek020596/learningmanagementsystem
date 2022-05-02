package com.te.learningmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.learningmanagementsystem.dto.EmployeePrimaryInfo;
import com.te.learningmanagementsystem.service.EmployeePrimaryInfoService;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

	@Autowired
	private EmployeePrimaryInfoService service;
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<?> getdetails(@PathVariable int empId) {
		EmployeePrimaryInfo details=service.findByEmployeeId(empId);
				if(details!=null) {
					return new ResponseEntity<EmployeePrimaryInfo>(details,HttpStatus.OK);	
				}else {
					return new ResponseEntity<String>("No not found",HttpStatus.INTERNAL_SERVER_ERROR);
				}
	}
	@PostMapping("/add")
	public ResponseEntity<?> adddetails(@RequestBody EmployeePrimaryInfo employeePrimaryInfo) {
		EmployeePrimaryInfo adddetails=service.addEmployee(employeePrimaryInfo);
				if(adddetails!=null) {
					return new ResponseEntity<EmployeePrimaryInfo>(adddetails,HttpStatus.OK);	
				}else {
					return new ResponseEntity<String>("No not found",HttpStatus.INTERNAL_SERVER_ERROR);
				}
	}
	@PutMapping("/update/{empId}")
	public ResponseEntity<?> updatedetails(@PathVariable int empId, @RequestBody EmployeePrimaryInfo employeePrimaryInfo) {
		EmployeePrimaryInfo updatedetails=service.updateEmployee(empId,employeePrimaryInfo);
				if(updatedetails!=null) {
					return new ResponseEntity<EmployeePrimaryInfo>(updatedetails,HttpStatus.OK);	
				}else {
					return new ResponseEntity<String>("No not found",HttpStatus.INTERNAL_SERVER_ERROR);
				}
	}
}

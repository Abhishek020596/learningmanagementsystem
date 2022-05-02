package com.te.learningmanagementsystem.service;

import com.te.learningmanagementsystem.dto.EmployeePrimaryInfo;

public interface EmployeePrimaryInfoService {

	public EmployeePrimaryInfo findByEmployeeId(int empId);

	public EmployeePrimaryInfo addEmployee(EmployeePrimaryInfo employeePrimaryInfo);

	public EmployeePrimaryInfo updateEmployee(int empId,EmployeePrimaryInfo employeePrimaryInfo);
}

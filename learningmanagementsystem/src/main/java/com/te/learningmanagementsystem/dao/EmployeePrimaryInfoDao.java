package com.te.learningmanagementsystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.learningmanagementsystem.dto.EmployeePrimaryInfo;

public interface EmployeePrimaryInfoDao extends CrudRepository<EmployeePrimaryInfo, Integer> {
	
	public EmployeePrimaryInfo findByEmployeeId(int empId);

}

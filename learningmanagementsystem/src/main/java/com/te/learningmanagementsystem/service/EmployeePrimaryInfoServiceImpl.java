package com.te.learningmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.learningmanagementsystem.dao.EmployeePrimaryInfoDao;
import com.te.learningmanagementsystem.dto.EmployeePrimaryInfo;
@Service
public class EmployeePrimaryInfoServiceImpl implements EmployeePrimaryInfoService{

	@Autowired
	private EmployeePrimaryInfoDao empdao;

	@Override
	public EmployeePrimaryInfo findByEmployeeId(int empId) {
		return empdao.findByEmployeeId(empId);
	}

	@Override
	public EmployeePrimaryInfo addEmployee(EmployeePrimaryInfo employeePrimaryInfo) {
		return empdao.save(employeePrimaryInfo);
	}

	@Override
	public EmployeePrimaryInfo updateEmployee(int empId, EmployeePrimaryInfo employeePrimaryInfo) {
		employeePrimaryInfo.setEmployeeId(empId);
		return empdao.save(employeePrimaryInfo);
	}
		
}

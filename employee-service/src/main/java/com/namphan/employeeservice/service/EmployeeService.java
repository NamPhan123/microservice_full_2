package com.namphan.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namphan.employeeservice.entity.EmployeeEntity;
import com.namphan.employeeservice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<EmployeeEntity> findAll() {
		return employeeRepository.findAll();
	}
	
	public List<EmployeeEntity> findByDepartmentId(Long departmentId) {
		return employeeRepository.findByDepartmentId(departmentId);
	}
	
	public EmployeeEntity findById(Long id) {
		return employeeRepository.findById(id).get();
	}
	
	public EmployeeEntity save(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

}

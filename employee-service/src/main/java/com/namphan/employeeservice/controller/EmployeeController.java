package com.namphan.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.namphan.employeeservice.entity.EmployeeEntity;
import com.namphan.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<EmployeeEntity> findAll() {
		return employeeService.findAll();
	}
	
	@GetMapping("/{id}")
	public EmployeeEntity findById(@PathVariable Long id) {
		return employeeService.findById(id);
	}
	
	@GetMapping("/department/{departmentId}")
	public List<EmployeeEntity> findByDepartmentId(@PathVariable Long departmentId) {
		return employeeService.findByDepartmentId(departmentId);
	}
	
	@PostMapping
	public EmployeeEntity create(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.save(employeeEntity);
	}

}

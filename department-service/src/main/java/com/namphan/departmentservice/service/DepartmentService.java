package com.namphan.departmentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namphan.departmentservice.client.EmployeeClient;
import com.namphan.departmentservice.entity.DepartmentEntity;
import com.namphan.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeClient employeeClient;
	
	public List<DepartmentEntity> findAll() {
		return departmentRepository.findAll();
	}
	
	public DepartmentEntity findById(Long id) {
		return departmentRepository.findById(id).get();
	}
	
	public DepartmentEntity findWithEmployee(Long id) {
		DepartmentEntity departmentEntity = departmentRepository.findById(id).get();
		departmentEntity.setListEMployee(employeeClient.findByDepartmentId(id));
		return departmentEntity;
	}
	
	public DepartmentEntity save(DepartmentEntity departmentEntity) {
		return departmentRepository.save(departmentEntity);
	}

}

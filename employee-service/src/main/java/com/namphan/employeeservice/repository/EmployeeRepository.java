package com.namphan.employeeservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namphan.employeeservice.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	List<EmployeeEntity> findByDepartmentId(Long departmentId);
}

package com.namphan.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namphan.departmentservice.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

}

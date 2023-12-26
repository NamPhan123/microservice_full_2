package com.namphan.departmentservice.entity;

import java.util.ArrayList;
import java.util.List;

import com.namphan.departmentservice.model.EmployeeModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "departments")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;
	private String departmentName;
	
	@Transient
	private List<EmployeeModel> listEMployee = new ArrayList<>();

}

package com.namphan.departmentservice.model;

import lombok.Data;

@Data
public class EmployeeModel {
	private Long employeeId;
	private String name;
	private Long departmentId;
}

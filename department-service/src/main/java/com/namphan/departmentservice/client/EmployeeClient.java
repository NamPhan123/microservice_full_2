package com.namphan.departmentservice.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.namphan.departmentservice.model.EmployeeModel;


@HttpExchange
public interface EmployeeClient {
	
	@GetExchange("/employee/department/{departmentId}")
	public List<EmployeeModel> findByDepartmentId(@PathVariable Long departmentId);

}

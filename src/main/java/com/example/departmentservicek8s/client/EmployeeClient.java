package com.example.departmentservicek8s.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.departmentservicek8s.model.Employee;

@FeignClient(name = "employee")
public interface EmployeeClient {

	@GetMapping("/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") int departmentId);
	
	@GetMapping("/employee/emp")
	public String getStringFromEmployee();
	
}

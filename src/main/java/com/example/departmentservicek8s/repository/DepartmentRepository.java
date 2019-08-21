package com.example.departmentservicek8s.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.departmentservicek8s.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

	List<Department> findByOrganizationId(Long organizationId);
	
}

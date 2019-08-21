package com.example.departmentservicek8s.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private int id;
	private Long organizationId;
	private String name;
	@Transient
	private List<Employee> employees = new ArrayList<>();

	public Department() {
		
	}

	public Department(Long organizationId, String name) {
		super();
		this.organizationId = organizationId;
		this.name = name;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", organizationId=" + organizationId + ", name=" + name + "]";
	}

}

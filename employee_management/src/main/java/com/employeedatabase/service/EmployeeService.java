package com.employeedatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeedatabase.entity.Employee;
import com.employeedatabase.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;


	/*
	 * To get all the Employee Details present in DataBase
	 */
	public List<Employee>  getAllEmployees( ) {
		List<Employee> list = employeeRepository.findAll();
		return list;
	}

	/*
	 * Adding Employee details to database 
	 * This method is Mapped to register
	 */
	public void addEmployee( Employee employee) {
		employeeRepository.save(employee);
	}

	/*
	 * UPDATE Employee details to database 
	 * This method is Mapped to register
	 */
	public void updateEmployee(long id,Employee employee) {
		employeeRepository.save(employee);

	}
	/*
	 * UPDATE Employee details to database 
	 * This method is Mapped to register
	 */
	public Employee findById(long id) {
	Employee employee=	employeeRepository.findById(id);
	return employee;
	}
	/*
	 * DELETE Employee details to database 
	 * This method is Mapped to delete
	 */
	public Employee deleteById(long id) {
		Employee employee=	employeeRepository.deleteById(id);
		return employee;
		}
	/*
	 * FIND employee by ID
	 */
	public Employee  getEmployeeById( long empId) {
	Employee employee=	employeeRepository.findById(empId);
		return employee;
	}


}

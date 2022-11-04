package com.employeedatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeedatabase.entity.Employee;
import com.employeedatabase.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
	public void updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
		service.updateEmployee(id, employee);
	}

	@DeleteMapping("/delete/{empId}")
	public void deleteEmployee(@PathVariable long empId, @RequestBody Employee employee) throws Exception {

		employee = service.findById(empId);
		if (employee.equals(null)) {
			throw new Exception();
		} else {
			service.deleteById(empId);
		}
	}

	@RequestMapping("/employee/{empId}")
	public Employee getEmployees(@PathVariable long empId) {
		Employee emp = service.getEmployeeById(empId);
		return emp;
	}

}

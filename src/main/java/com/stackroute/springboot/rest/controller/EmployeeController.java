package com.stackroute.springboot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.springboot.rest.entity.Employee;
import com.stackroute.springboot.rest.exception.EmployeeAlreadyExistsException;
import com.stackroute.springboot.rest.service.IEmployeeService;

@RestController
@RequestMapping("api/v1/employee")
//http://localhost:8083/api/v1/employee/employees
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	private ResponseEntity responseEntity;
	
	
	/*
	 * {
	 * "id":1,
	 * "name":
	 * }
	 * */
	@PostMapping("/employees")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) throws EmployeeAlreadyExistsException{
		try {
			Employee createdEmployee = employeeService.saveEmployee(employee);
			responseEntity = new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
		} catch (EmployeeAlreadyExistsException e) {
			
		} catch(Exception e) {
			responseEntity = new ResponseEntity<>("Some internal Error Occured..", HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		return responseEntity;
	}

}

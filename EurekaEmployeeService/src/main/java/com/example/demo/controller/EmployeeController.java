package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(Employee employee){
		return new ResponseEntity<Employee>(empService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping("/employee/{empid}")
	public ResponseEntity<Employee> findEmployee(@PathVariable Integer empid) {
		return new ResponseEntity<Employee>(empService.findEmployee(empid), HttpStatus.OK);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> findAllEmployee(){
		return new ResponseEntity<List<Employee>>(empService.findAllEmployee(), HttpStatus.OK);
	}
		
}

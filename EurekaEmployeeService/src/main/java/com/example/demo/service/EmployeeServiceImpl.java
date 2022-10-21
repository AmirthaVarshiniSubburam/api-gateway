package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired 
	EmployeeRepository empRepo;
		
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee findEmployee(Integer empid) {
		// TODO Auto-generated method stub
		return empRepo.findById(empid).get();
	}

}

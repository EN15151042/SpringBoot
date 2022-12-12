package net.javaguides.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee) ;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","Id",id));
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Employee a1 = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
		a1.setFirstName(employee.getFirstName());
		a1.setLastName(employee.getLastName());
		a1.setEmail(employee.getEmail());
	 employeeRepository.save(a1);
		return a1;
	}

	@Override
	public void deleteEmloyee(long id) {
		employeeRepository.deleteById(id);
		employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","Id",id));
	}

	
}

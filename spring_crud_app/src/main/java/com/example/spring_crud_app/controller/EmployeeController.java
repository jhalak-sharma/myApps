package com.example.spring_crud_app.controller;

import com.example.spring_crud_app.model.Employee;
import com.example.spring_crud_app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    Add new employee
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
    	
    	System.out.println("XXXXXXXX"+employee.getAddress());
        return employeeService.addEmployee(employee);
    }
    @PostMapping("/addAllEmployees")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees){
        return employeeService.addAllEmployees(employees);
    }
//    Get Employee by ID
    @GetMapping("/getEmployeeByID/{id}")
    public Employee getEmployeeByID(@PathVariable int id){
        return employeeService.getEmployeeByID(id);
    }
//    Get Employee by name
    @GetMapping("/getEmployeeByName/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
    	System.out.println("name is "+name);
        return employeeService.getEmployeeByName(name);
    }
    @PostMapping("/updateEmployee")
    public Employee updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }
//    Delete Employee by id
    @DeleteMapping("/deleteEmployeeByID/{id}")
    public String deleteEmployeeByID(@PathVariable int id){
    	if(employeeService.deleteEmployeeByID(id)) {
    		return "employee "+id+"is deleted successfuly"; 
    	}else {
    		return "unable to detele employee with " +id;
    	}
       
    }
}

package com.example.spring_crud_app.repository;

import com.example.spring_crud_app.model.Employee;
import com.example.spring_crud_app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

    Employee getByName(String name);
    Employee findByName(String name);
}

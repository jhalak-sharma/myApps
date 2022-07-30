package com.example.spring_crud_app.repository;

import com.example.spring_crud_app.model.Employee;
import com.example.spring_crud_app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

    Employee getByName(String name);
    Employee findByName(String name);
}

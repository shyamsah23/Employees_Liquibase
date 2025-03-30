package com.example.Emp.controller;

import com.example.Emp.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/allEmployees")
    public ResponseEntity<List<Employee>>  getEmployeeList(){
        List<Employee> l1=new ArrayList<>();
        Employee e1=new Employee(1,"Shyam",21,"dummy@gmail.com","Mumbai");
        l1.add(e1);
        return ResponseEntity.ok(l1);
    }
}

package com.example.Emp.mapper;

import com.example.Emp.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("Select * from employees_liqui")
    List<Employee> getAllEmployees();
}

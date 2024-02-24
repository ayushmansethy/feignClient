package com.ayush.opein_feign_prac.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ayush.opein_feign_prac.entity.Employee;
import com.ayush.opein_feign_prac.entity.Student;

@FeignClient(name = "DataRetriver",url = "http://localhost:8080/api/" )
public interface DataRetriver {

    @GetMapping("/st")
    public List<Student> giveStList() ;
    @GetMapping("/emp")
    public List<Employee> givEmployees();
}

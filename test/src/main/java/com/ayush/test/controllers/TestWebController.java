package com.ayush.test.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.test.entity.Employee;
import com.ayush.test.entity.Student;

@RestController
@RequestMapping("/api")
public class TestWebController {

    @GetMapping("/st")
    public List<Student> giveList(){
        List<Student> st = new ArrayList<>() ;

        st.add(new Student(5, "ayush"));
        st.add(new Student(6, "kishan"));
        st.add(new Student(56, "arun"));

        return st ;
    }

    @GetMapping("/emp")
    public List<Employee> giveEmpList(){
        List<Employee> ls = new ArrayList<>() ;
        ls.add(new Employee(23, "priya"));
        ls.add(new Employee(24, "john"));
        ls.add(new Employee(23, "jadu"));

        return ls ;

    }
    
}

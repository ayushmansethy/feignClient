package com.ayush.test.controllers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayush.test.entity.Employee;
import com.ayush.test.entity.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;

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

    @GetMapping("/test_get")
    public Map<String, List<String>> giveData(){
        Map<String,List<String>> mp = new LinkedHashMap<>() ;
        mp.put("name", List.of("good,bad"));
        // mp.put("id", "12456556") ;

        // List<Map<String,String>> ls = List.of(mp,mp) ;
        return mp  ;
    }

    @PostMapping("/test_post")
    public Map<String,Object> postData(@RequestBody @JsonValue  Map<String,Object> mp ){
        return  mp ;
        
    }
    
}

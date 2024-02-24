package com.ayush.opein_feign_prac;

import org.springframework.web.bind.annotation.RestController;

import com.ayush.opein_feign_prac.client.DataRetriver;
import com.ayush.opein_feign_prac.entity.EmpStDto;
import com.ayush.opein_feign_prac.entity.EmpStResponse;
import com.ayush.opein_feign_prac.entity.Employee;
import com.ayush.opein_feign_prac.entity.Student;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class WeBController {
    @Autowired
    DataRetriver retriver;

    @GetMapping("/emp_st")
    public List<EmpStDto> giveAll() {
        List<Employee> givEmployees = retriver.givEmployees();
        List<Student> giveStList = retriver.giveStList();

        List<EmpStResponse> lst = new ArrayList<>();

        int i = givEmployees.size() > giveStList.size() ? givEmployees.size() : giveStList.size();
        for (int j = 0; j < i; j++) {
            lst.add(new EmpStResponse(givEmployees.get(j), giveStList.get(j)));

        }

        List<EmpStDto> ls = new ArrayList<>();

        ModelMapper modelMapper = new ModelMapper();
        for (int j = 0; j < lst.size(); j++) {
            // EmpStDto map = mapper.map(lst.get(j), EmpStDto.class) ;
            // ls.add(map);
            EmpStResponse obj = lst.get(j);

            TypeMap<EmpStResponse, EmpStDto> mapping = modelMapper.typeMap(EmpStResponse.class, EmpStDto.class)
                    .addMapping(src -> src.getEmployee().getEmpId(), EmpStDto::setEmployeeEmpId)
                    .addMapping(src -> src.getEmployee().getEmpName(), EmpStDto::setEmployeeEmpName)
                    .addMapping(src -> src.getStudent().getId(), EmpStDto::setStudentId)
                    .addMapping(src -> src.getStudent().getName(), EmpStDto::setStudentName);

            EmpStDto map = modelMapper.map(lst.get(j), EmpStDto.class);
            ls.add(map);

        }

        // return ls;
        new R
    }

}

package com.ayush.opein_feign_prac.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpStDto {

    Integer studentId ;
    String studentName;
    Integer employeeEmpId;
    String employeeEmpName ;
    
}

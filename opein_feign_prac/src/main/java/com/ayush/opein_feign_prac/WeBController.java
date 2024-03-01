package com.ayush.opein_feign_prac;

import org.springframework.web.bind.annotation.RestController;

import com.ayush.opein_feign_prac.client.DataRetriver;
import com.ayush.opein_feign_prac.entity.AllDetails;

import com.ayush.opein_feign_prac.service.DataRetriverService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class WeBController {
    @Autowired
    DataRetriverService service ;
    @GetMapping
    public AllDetails give(){
        return service.giveAll() ;
    }
  

}

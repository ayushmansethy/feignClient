package com.ayush.opein_feign_prac.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ayush.opein_feign_prac.entity.Comment__;
import com.ayush.opein_feign_prac.entity.Post;
import com.ayush.opein_feign_prac.entity.ToDos;

@FeignClient(name = "DataRetriver",url = "https://jsonplaceholder.typicode.com" )
public interface DataRetriver {

    @GetMapping("/todos/2")
    public ToDos  getToDo() ;
    @GetMapping("/posts/1")
    public Post  getPost() ;
    @GetMapping("/comments/1")
    public Comment__  getComment() ;

    
}

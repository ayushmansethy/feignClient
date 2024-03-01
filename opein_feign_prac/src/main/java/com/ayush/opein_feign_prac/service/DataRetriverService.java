package com.ayush.opein_feign_prac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayush.opein_feign_prac.client.DataRetriver;
import com.ayush.opein_feign_prac.entity.AllDetails;
import com.ayush.opein_feign_prac.entity.Comment__;
import com.ayush.opein_feign_prac.entity.Post;
import com.ayush.opein_feign_prac.entity.ToDos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class DataRetriverService {

    @Autowired
    DataRetriver retriver ;


    public AllDetails giveAll(){
        Post post = retriver.getPost();
        Comment__ comment = retriver.getComment();
        ToDos toDo = retriver.getToDo();

        
        return AllDetails.builder().email(comment.getEmail()).body(post.getBody()).title(toDo.getTitle()).build();
        
    }
    


    
}

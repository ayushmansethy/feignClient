package com.ayush.opein_feign_prac.entity;

import feign.RequestLine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AllDetails {

    

    String email ;
    String body  ;
    String title  ;
}

package com.service.cserpc.controller;

import org.springframework.stereotype.Component;


@Component
public class CserpcDelegate implements Cserpc {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}

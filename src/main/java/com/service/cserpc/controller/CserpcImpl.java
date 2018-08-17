package com.service.cserpc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-08-10T06:07:01.599Z")

@RpcSchema(schemaId = "cserpc")
public class CserpcImpl implements Cserpc{

    @Autowired
    private CserpcDelegate cserpcDelegate;


    public String helloworld(String name) {

        return cserpcDelegate.helloworld(name);
    }

}

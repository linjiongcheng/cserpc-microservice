package com.service.cserpc.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCserpc {

    CserpcDelegate cserpcDelegate = new CserpcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cserpcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}

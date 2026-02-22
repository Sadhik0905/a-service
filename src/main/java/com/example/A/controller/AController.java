package com.example.A.controller;

import com.example.A.extern.BInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @Autowired
    private BInterface bInterface;


    @GetMapping("/greetA")
    public String greetFromA(){
        return "Hello From A";
    }

    @GetMapping("/CallB")
    public String callB(){
        return bInterface.greetFromB();
    }

}

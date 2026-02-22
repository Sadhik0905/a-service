package com.example.A.extern;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "B-Service")
public interface BInterface {

    @GetMapping("/greetB")
    public String greetFromB();
}

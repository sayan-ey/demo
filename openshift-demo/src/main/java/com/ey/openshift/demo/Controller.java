package com.ey.openshift.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
    String return1(){
        return "Hello World";
    }
}

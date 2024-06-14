package com.techm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//REST Controller
@RestController
class GreetingController {

 @GetMapping("/greet")
 public String greet() {
     return "Hello, welcome to the Spring Boot application!";
 }
}
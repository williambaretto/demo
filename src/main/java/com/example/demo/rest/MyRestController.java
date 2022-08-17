package com.example.demo.rest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/hello/{name}")
      String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
      }

}
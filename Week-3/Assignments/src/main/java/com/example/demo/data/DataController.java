package com.example.demo.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//make this class to serve endpoints
@RequestMapping(path = "/getData")
public class DataController {

    @GetMapping//get things from server
    public String hello() {
        return "Lack of Parameter";
    }
}

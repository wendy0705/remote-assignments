package com.example.demo.data;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.http.HttpStatus;

@RestController//make this class to serve endpoints
@RequestMapping
public class DataController {

    @GetMapping(path = "/data")
    public String getData(@RequestParam(value = "number", required = false) String n) {//if input is integer, it can turn to string automatically, which won't result in NumberFormatException
        try {
            if (n == null || n.isEmpty()) {
                return "Lack of Parameter";
            } else {
                int number = Integer.parseInt(n);
                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }
                if (number > 1000363)
                    return "Too Large";//when number > 1000363, 1+2+...+1000363 will larger than max integer which is 2147483647
                return Integer.toString(sum);
            }
        } catch (NumberFormatException e) {
            return "Wrong Parameter";
        }
    }
//    @GetMapping(path = "/myName")
//    public String myname(String n) {
//
//        return n;
//    }

}

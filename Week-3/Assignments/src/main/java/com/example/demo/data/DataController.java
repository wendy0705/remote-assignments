package com.example.demo.data;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.http.HttpStatus;

@RestController//make this class to serve endpoints
@RequestMapping
public class DataController{

    @GetMapping(path = "/data")
    public String getData(@RequestParam(value = "number", required = false) Integer n) {

        if (n == null) {
            return "Lack of Parameter";
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            if(n > 1000363) return "Too Large";//when n > 1000363, 1+2+...+1000363 will larger than max integer which is 2147483647
            return Integer.toString(sum);
        }
    }

    @ExceptionHandler(RuntimeException.class)
    public String handleTypeMismatch() {
        return "Wrong Parameter";
    }

}

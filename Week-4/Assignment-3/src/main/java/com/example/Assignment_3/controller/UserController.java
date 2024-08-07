package com.example.Assignment_3.controller;

import com.example.Assignment_3.entity.User;
import com.example.Assignment_3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/")
    public String sign() {
        return "home";
    }

    @GetMapping("/member")
    public String success() {
        return "member";
    }

    @PostMapping("/signin")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        if (userDao.checkMemberByEmailandPassword(email, password)) {
//            System.out.println("turn to success page");
            return ResponseEntity.ok().build();//turn to success page
        } else {
            return ResponseEntity.status(404).build();//stay at home page
        }
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestParam String email, @RequestParam String password) {
        if (!userDao.checkMemberByEmail(email)) {
            userDao.createUser(new User(email, password));//add user to database
//            System.out.println("add user to database");
            return ResponseEntity.ok().build();//turn to success page
        } else {
            return ResponseEntity.status(404).build();//stay at home page
        }
    }
}

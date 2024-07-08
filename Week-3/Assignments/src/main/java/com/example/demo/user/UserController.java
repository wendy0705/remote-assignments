package com.example.demo.user;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.*;

@Controller//make this class to serve endpoints
@RequestMapping
public class UserController {

    @GetMapping(value = "/myName")
//    @ResponseBody
    public String checkCookie(@CookieValue(value = "user-id", required = false) String userId, Model model) {
        if (userId != null) {
            model.addAttribute("userId", userId);
            return "name";
        }else {
            return "welcome";//null, ask user name
        }
    }

    @PostMapping("/trackName")
    public ResponseEntity<Void> setCookie(@RequestParam(value = "name", required = false) String name, HttpServletResponse response) {

        ResponseCookie springCookie = ResponseCookie.from("user-id", name)//(cookie's name, cookie's value)
                .httpOnly(true)
                .secure(false)
                .path("/")
                .maxAge(5)
                .domain("localhost")
                .build();

        response.addHeader(HttpHeaders.SET_COOKIE, springCookie.toString());

        return ResponseEntity.status(302).header(HttpHeaders.LOCATION, "/myName").build();
    }

}

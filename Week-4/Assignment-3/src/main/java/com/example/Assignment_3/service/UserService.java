package com.example.Assignment_3.service;

import com.example.Assignment_3.entity.User;

public interface UserService {

    Boolean checkMemberByEmailandPassword(String email, String password);

    Boolean checkMemberByEmail(String email);

    void createUser(User user);
}

package com.example.Assignment_3.dao;

import com.example.Assignment_3.entity.User;

public interface UserDao {

    Boolean checkMemberByEmailandPassword(String email, String password);

    Boolean checkMemberByEmail(String email);

    void createUser(User user);
}

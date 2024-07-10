package com.example.Assignment_3.dao;

import com.example.Assignment_3.entity.User;
import com.example.Assignment_3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.*;


@Component
public class UserDao implements UserService {

    @Autowired
//    private User user;
    private JdbcTemplate jdbcTemplate;
    //    private String sql;

    @Override
    public Boolean checkMemberByEmailandPassword(String email, String password) {
        String sql = "SELECT COUNT(*) FROM user WHERE email = ? AND password = ?";
        Integer count = jdbcTemplate.queryForObject(sql, new Object[]{email, password}, Integer.class);
        return count != null && count > 0;
    }

    @Override
    public Boolean checkMemberByEmail(String email) {
        String sql = "SELECT COUNT(*) FROM user WHERE email = ?";
        Integer count = jdbcTemplate.queryForObject(sql, new Object[]{email}, Integer.class);
        return count != null && count > 0;
    }

    @Override
    public void createUser(User user) {
        String sql = "INSERT INTO user (email, password) VALUES (?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            return ps;
        }, keyHolder);

        if (keyHolder.getKey() != null) {
            user.setId(keyHolder.getKey().intValue());
        }
    }

}

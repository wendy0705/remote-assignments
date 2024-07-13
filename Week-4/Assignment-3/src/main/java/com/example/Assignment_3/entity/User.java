package com.example.Assignment_3.entity;


//Because no @Table annotation exists, it is assumed that this entity is mapped
// to a table named User.
public class User {
    //The User object’s id property is annotated with @Id so that JPA
    // recognizes it as the object’s ID. The id property is also annotated with @GeneratedValue
    // to indicate that the ID should be generated automatically.
    private int id;
    private String email;
    private String password;

//    public User() {
//        // The default constructor exists only for the sake of JPA. You do not use it directly,
//        // so it is designated as protected. The other constructor is the one you use to create
//        // instances of User to be saved to the database.
//    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
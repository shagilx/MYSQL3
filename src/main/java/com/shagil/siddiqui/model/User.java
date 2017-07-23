package com.shagil.siddiqui.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gauravgarg on 11/7/17.
 */
@Entity
@Table(name = "users_table")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_name",nullable = false,unique = true)
    private String userName;
    @Column(name = "password",nullable = false)
//    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public User() {
    }

    public User(String userName) {
    }

//    public Integer getUserId() {
//        return userId;
//    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean exist() {
        if (userName!=null && password!=null)
            return true;
        else
            return false;
    }
}

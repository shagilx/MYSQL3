//package com.shagil.siddiqui.model;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Set;
//
///**
// * Created by gauravgarg on 14/7/17.
// */
//@Entity
//@Table(name = "role")
//public class Role implements Serializable{
//    private Long id;
//    private String name;
//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//}
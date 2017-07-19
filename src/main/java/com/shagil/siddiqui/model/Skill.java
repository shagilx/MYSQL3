package com.shagil.siddiqui.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by gauravgarg on 5/7/17.
 */
@Entity
@Table(name = "skills_table")
public class Skill implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "skilltext",unique = true)
    private String skill;

    public Skill() {}

    public Skill(String skill) {
        this.skill = skill;
    }



    public void setId(Integer id) {
        this.id = id;
    }

//    public Integer getId() {
//        return id;
//    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

}

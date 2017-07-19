package com.shagil.siddiqui.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gauravgarg on 11/7/17.
 */
@Entity
@Table(name = "score_table")
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "user_name")
    private String user;
    @Column(name = "skill")
    private String skill;
    @Column(name = "level")
    private String level;
    @Column(name = "score",nullable = false)
    private Integer score;
    @Column(name = "is_completed",nullable = false)
    private boolean isCompleted;

    public Score() {
    }

//    public Integer getId() {
//        return id;
//    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}

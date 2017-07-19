package com.shagil.siddiqui.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by gauravgarg on 18/7/17.
 */
@Entity
@Table(name = "response_table")
public class Response implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;
    @Column(name = "user_name",nullable = false)
    private String userName;
    @Column(nullable =  false)
    private String skill;
    @Column(nullable = false)
    private String level;
    @Column(nullable = false)
    private Integer score;
    @Column(name = "is_completed",nullable = false)
    private boolean isCompleted;

    @OneToMany(mappedBy = "response",cascade = CascadeType.ALL)
    private Set<OptionResponse> optionResponseSet;

    public Response() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Set<OptionResponse> getOptionResponseSet() {
        return optionResponseSet;
    }

    public void setOptionResponseSet(Set<OptionResponse> optionResponseSet) {
        this.optionResponseSet = optionResponseSet;
    }
}

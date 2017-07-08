package com.shagil.siddiqui;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by gauravgarg on 5/7/17.
 */
@Entity
@Table(name = "skills_table")
public class Skills {
    @Id
    @Column(name = "skilltext")
    private String skill;

    @OneToMany(mappedBy = "skills",cascade = CascadeType.ALL)
    private Set<Question> question;

    public Skills() {}

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Set<Question> getQuestionList() {
        return question;
    }

    public void setQuestionList(Set<Question> questionList) {
        this.question = questionList;
    }
}

package com.shagil.siddiqui;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by gauravgarg on 5/7/17.
 */
@Entity
@Table(name = "questions_table")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "qid")
    private Integer qid;
    @Column(name = "text")
    private String questionText;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skilltext")
    Skills skills;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "leveltext")
    Levels levels;

    public Question(){}

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }
//
    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

}

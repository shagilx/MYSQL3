package com.shagil.siddiqui;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Set;

/**
 * Created by gauravgarg on 5/7/17.
 */
@Entity
@Table(name = "questions_table")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "qid",nullable = false)
    private Integer qid;
    @Column(name = "image")
    private Blob image;
    @Column(name = "text",nullable = false)
    private String questionText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_text",nullable = false,referencedColumnName = "skilltext")
    Skills skills;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "level_text",nullable = false,referencedColumnName = "leveltext")
    Levels levels;

    @OneToMany(mappedBy = "qid",cascade = CascadeType.ALL)
    private Set<Options> optionsSet;

    public Question(){}


    public Question(Blob image, String questionText, Skills skills, Levels levels) {
        this.image = image;
        this.questionText = questionText;
        this.skills = skills;
        this.levels = levels;
    }

    public Set<Options> getOptionsSet() {
        return optionsSet;
    }

    public void setOptionsSet(Set<Options> optionsSet) {
        this.optionsSet = optionsSet;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

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

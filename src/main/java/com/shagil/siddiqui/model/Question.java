package com.shagil.siddiqui.model;

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
    private String image;
    @Column(name = "text",nullable = false)
    private String questionText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_text",nullable = false,referencedColumnName = "skilltext")
    Skill skill;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "level_text",nullable = false,referencedColumnName = "leveltext")
    Level level;

    @OneToMany(mappedBy = "qid",cascade = CascadeType.ALL)
    private Set<Option> optionSet;

    public Question(){}


    public Question(String image, String questionText, Skill skills, Level levels) {
        this.image = image;
        this.questionText = questionText;
        this.skill = skills;
        this.level = levels;
    }

    public Set<Option> getOptionSet() {
        return optionSet;
    }

    public void setOptionSet(Set<Option> optionSet) {
        this.optionSet = optionSet;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
//
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return questionText;
    }
}

package com.shagil.siddiqui;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by gauravgarg on 5/7/17.
 */
@Entity
@Table(name = "levels_table")
public class Levels {
    @Id
    @Column(name = "leveltext")
    private String level;

    @OneToMany(mappedBy = "levels",cascade = CascadeType.ALL)
    private Set<Question> questionList;

    public Levels() {}

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Set<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(Set<Question> questionList) {
        this.questionList = questionList;
    }
}

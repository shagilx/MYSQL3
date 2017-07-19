package com.shagil.siddiqui.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shagil on 9/7/17.
 */
@Entity
@Table(name = "options_table")
public class Option implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "option_id")
    private Integer optionId;
    @Column(name = "qid")
    private Integer qid;
    @Column(name = "option_text",nullable = false)
    private String optionText;
    @Column(name = "is_correct")
    private boolean isCorrect;

    public Option() {
    }

    public Option(Integer qid, String optionText, boolean isCorrect) {
        this.qid = qid;
        this.optionText = optionText;
        this.isCorrect = isCorrect;
    }


    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}

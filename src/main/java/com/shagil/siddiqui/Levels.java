package com.shagil.siddiqui;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by gauravgarg on 5/7/17.
 */
@Entity
@Table(name = "levels_table")
public class Levels implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "leveltext",nullable = false)
    private String level;

    public Levels() {}

    public Levels(String level) {
        this.level = level;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

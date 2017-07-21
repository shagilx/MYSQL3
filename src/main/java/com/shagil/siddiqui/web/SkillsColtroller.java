package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.QuestionRepository;
import com.shagil.siddiqui.Repository.SkillsRepository;
import com.shagil.siddiqui.model.Skill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gauravgarg on 10/7/17.
 */
@RestController
@RequestMapping(path = "/skills")
public class SkillsColtroller {
    static final Logger logger = LoggerFactory.getLogger(SkillsColtroller.class.getName());
    @Autowired
    private SkillsRepository skillsRepository;
    @GetMapping(path = "/all")
    @CrossOrigin(origins = "http://127.0.0.1:8887")
    public @ResponseBody Iterable<Skill> getAllSkills(){
        return skillsRepository.findAll();
    }

}

package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.SkillsRepository;
import com.shagil.siddiqui.model.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gauravgarg on 10/7/17.
 */
@Controller
@RequestMapping(path = "/skills")
public class SkillsColtroller {
    @Autowired
    private SkillsRepository skillsRepository;
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Skills> getAllSkills(){
        return skillsRepository.findAll();
    }
}

package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.LevelsRepository;
import com.shagil.siddiqui.Repository.ScoreRepository;
import com.shagil.siddiqui.Repository.SkillsRepository;
import com.shagil.siddiqui.model.Level;
import com.shagil.siddiqui.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gauravgarg on 16/7/17.
 */
@RestController
@RequestMapping("/levels")
public class LevelController {
    @Autowired
    private LevelsRepository levelsRepository;
    private ScoreRepository scoreRepository;
    @GetMapping(path = "/all")
    @CrossOrigin(origins = "http://127.0.0.1:8887")
    public @ResponseBody Iterable<Level> getAllSkills(){
        return levelsRepository.findAll();

    }
}

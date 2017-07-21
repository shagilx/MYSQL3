package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.LevelsRepository;
import com.shagil.siddiqui.model.Level;
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
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Level> getAllSkills(){
        return levelsRepository.findAll();

    }
}

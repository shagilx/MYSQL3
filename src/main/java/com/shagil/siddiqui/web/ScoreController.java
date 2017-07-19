package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.ScoreRepository;
import com.shagil.siddiqui.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gauravgarg on 13/7/17.
 */
@RestController
@RequestMapping(path = "/score")
public class ScoreController {
    @Autowired
    private ScoreRepository scoreRepository;

    @GetMapping("/get")
    public @ResponseBody
    Iterable<Score> getAlLScore() {
        return scoreRepository.findAll();
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResponseEntity<Score> insert(@RequestBody Score score) {
//        Score score = new Score();
//        score.setCompleted(true);
//        score.setLevel(new Level("Beginner"));
//        score.setScore(36);
//        score.setUser(new User("shagil"));
//        score.setSkill(new Skill("C"));

        scoreRepository.save(score);
        return new ResponseEntity<Score>(score, HttpStatus.OK);
    }
}

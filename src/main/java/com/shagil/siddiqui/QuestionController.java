package com.shagil.siddiqui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gauravgarg on 4/7/17.
 */
@Controller
@RequestMapping(path = "/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Question>getAllQuestions(){
        return questionRepository.findAll();
    }
}

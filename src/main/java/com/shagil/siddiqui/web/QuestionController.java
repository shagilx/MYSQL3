package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.QuestionRepository;
import com.shagil.siddiqui.model.Level;
import com.shagil.siddiqui.model.Question;
import com.shagil.siddiqui.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by gauravgarg on 4/7/17.
 */
@RestController
@RequestMapping(path = "/questions")
public class QuestionController {

    static final Logger logger = LoggerFactory.getLogger(QuestionController.class.getName());
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Question>getAllQuestions(){
        return questionRepository.findAll();
    }

    @CrossOrigin(origins = "http://127.0.0.1:8887")
    @GetMapping("/get-by-skill")
    @ResponseBody
    public List<Question> getBySkillAndLevel(String skill,  String level){
        try{
            List<Question> questionList=questionRepository.findAllBySkillAndLevel(skill, level);
            return questionList;
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return null;
    }
    @CrossOrigin(origins = "http://127.0.0.1:8887")
    @GetMapping("/skills")
    @ResponseBody
    public List<Level> getBySkills(String skill){
        try{
            List<Level> questionList=questionRepository.findDistinctBySkill(skill);
            return questionList;
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return null;
    }
//        @GetMapping("/q")
//        @CrossOrigin(origins = "http://127.0.0.1:8887")
//        public @ResponseBody
//        List<Question> getSkills(String skill){
//            try {
//                List<Question> skillList=questionRepository.findDistinctBySkill(skill);
//                return skillList;
//            }catch (Exception e){
//                logger.error(e.getMessage());
//            }
//            return null;
//
//        }


//    @GetMapping("/get-by-skill")
//    @ResponseBody
//    public List<Question> getBySkillAndLevel(@Param("skill") ArrayList<String> skills){
//        List<Question> questionList;
//        try{
//            questionList=questionRepository.findAllBySkillIn(skills);
//            System.out.println("questionList" + questionList.toArray().toString());
//            return questionList;
//
//        }catch (Exception e){
//            //return new String[]{"No questions"};
//            //logger
//            //return error code
//            return null;
//        }
//       // return questionList.toArray();
//
//    }

}

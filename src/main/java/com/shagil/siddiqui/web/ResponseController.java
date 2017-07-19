package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.ResponseRepository;
import com.shagil.siddiqui.model.OptionResponse;
import com.shagil.siddiqui.model.Question;
import com.shagil.siddiqui.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gauravgarg on 18/7/17.
 */
@RestController
@RequestMapping("/response")
public class ResponseController {
    static final Logger logger = LoggerFactory.getLogger(ResponseController.class.getName());
    @Autowired
    ResponseRepository responseRepository;

    @CrossOrigin(origins = "http://127.0.0.1:8887")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public boolean insert(@RequestBody Response response){
//        Response response=new Response();
//        response.setQid(1);
//        response.setRespOption(new String[]{"2","Hello","World","Siddiqui"});
//        response.setUserName("shagil");
//        responseRepository.save(response);
//        return new ResponseEntity<Response>(response, HttpStatus.OK);
        try{
            for (OptionResponse or: response.getOptionResponseSet()){
                   or.setResponse(response);
                }


            responseRepository.save(response);
            return true;
        }catch (Exception e){
            logger.error(e.getMessage());
        }

        return false;


    }
    @RequestMapping(value = "/get")
    public @ResponseBody Iterable<Response> get(){
        return responseRepository.findAll();
    }

}

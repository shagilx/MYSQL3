package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Service.ResponseServiceImpl;
import com.shagil.siddiqui.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gauravgarg on 18/7/17.
 */
@RestController
@RequestMapping("/response")
public class ResponseController {
    static final Logger logger = LoggerFactory.getLogger(ResponseController.class.getName());

    private final ResponseServiceImpl responseService;

    @Autowired
    public ResponseController(ResponseServiceImpl responseService) {
        this.responseService = responseService;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public boolean insert(@RequestBody Response response){
      try{
           responseService.addResponse(response);
            return true;
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return false;
    }

    @RequestMapping(value = "/count",method = RequestMethod.GET)
    @ResponseBody
    public Integer getCount(@RequestParam("user") String userName, @RequestParam("skill") String skill){

        return responseService.getCountOfResponse(userName,skill);
    }
//
//    @RequestMapping(value = "/get")
//    public @ResponseBody Iterable<Response> get(){
//        return responseService.getAll();
//    }

}

package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Service.UserServiceImpl;
import com.shagil.siddiqui.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gauravgarg on 11/7/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class.getName());

    private final UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/q")
    public boolean getByUserIdAndPassword(@RequestBody User user) {
        try {
            return userService.findUser(user).exist();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody boolean get(@RequestBody User user) {
            try {

                return userService.addUser(user);
            }catch (org.springframework.dao.DataIntegrityViolationException e) {
                logger.error(e.getMessage());
            }catch (Exception e){
                logger.error(e.getMessage());
            }
            return false;

    }

}

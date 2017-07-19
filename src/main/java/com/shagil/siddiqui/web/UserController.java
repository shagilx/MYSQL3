package com.shagil.siddiqui.web;

import com.shagil.siddiqui.Repository.UserRepository;
import com.shagil.siddiqui.model.User;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by gauravgarg on 11/7/17.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class.getName());
    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllQuestions() {
        return userRepository.findAll();
    }


//    @CrossOrigin(origins = "http://127.0.0.1:8887")
    @PostMapping("/q")
    public boolean getByUserIdAndPassword(@RequestBody User user) {
        try {
            User user1 = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
            return user1.exist();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

//    @CrossOrigin(origins = "http://127.0.0.1:8887")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean get(@RequestBody User user) {
        if (!user.getUserName().isEmpty() && !user.getPassword().isEmpty()) {
            try {
                userRepository.save(user);
                return true;

            }catch (org.springframework.dao.DataIntegrityViolationException e) {
                return false;
            }catch (Exception e){
                logger.error(e.getMessage());

            }
        }
        return false;
//
//

    }
}

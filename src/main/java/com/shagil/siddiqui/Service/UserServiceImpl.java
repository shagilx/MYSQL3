package com.shagil.siddiqui.Service;

import com.shagil.siddiqui.Repository.UserRepository;
import com.shagil.siddiqui.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gauravgarg on 20/7/17.
 */
@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean addUser(User user) {
        if (!user.getUserName().isEmpty() && !user.getPassword().isEmpty()) {
            userRepository.save(user);
            return true;
        }
        else return false;
    }

    @Override
    public User findUser(User user) {
        return userRepository.findByUserNameAndPassword(user.getUserName(),user.getPassword());
    }
}



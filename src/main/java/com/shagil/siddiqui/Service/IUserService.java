package com.shagil.siddiqui.Service;

import com.shagil.siddiqui.model.User;

/**
 * Created by gauravgarg on 20/7/17.
 */
public interface IUserService {
    boolean addUser(User user);
    User findUser(User user);
}

package com.lcwd.user.service.service;

import com.lcwd.user.service.entity.User;

import java.util.List;

public interface UserServices {
    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

        //get single user with userId

    User getUser(String userId);

    //TODO: delete
    //TODO: update




}

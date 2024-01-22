package com.springweb.springbootweb.service;

import com.springweb.springbootweb.entity.User;
import com.springweb.springbootweb.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);
}

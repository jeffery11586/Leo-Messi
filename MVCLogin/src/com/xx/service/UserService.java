package com.xx.service;

import com.xx.entity.User;

/**
 * UserService----UserDAO
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 15:27
 */
public interface UserService {
    public  User selectUserByName(String username);
}

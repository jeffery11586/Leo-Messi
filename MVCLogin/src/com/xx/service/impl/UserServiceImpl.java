package com.xx.service.impl;

import com.xx.dao.UserDAO;
import com.xx.dao.impl.UserDAOImpl;
import com.xx.entity.User;
import com.xx.service.UserService;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 15:28
 */
public class UserServiceImpl implements UserService {
 private UserDAO userDAO=new UserDAOImpl();


 @Override
 public User selectUserByName(String username) {
  //调用userDAO的根据用户名查询用户的方法
  return userDAO.selectUserByName(username);
 }
}

package com.xx.dao;

import com.xx.entity.User;

/**数据访问对象，负责数据的持久化
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 15:24
 */
public interface UserDAO {
    public User selectUserByName(String username);
    
}

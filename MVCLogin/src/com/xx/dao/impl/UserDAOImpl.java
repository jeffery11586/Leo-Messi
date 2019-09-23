package com.xx.dao.impl;

import com.xx.dao.UserDAO;
import com.xx.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 15:26
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public User selectUserByName(String username) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        User user=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql:///test","root","123456");
            String sql="select * from t_user where username=?";
            pstmt= conn.prepareStatement(sql);
            pstmt.setString(1,username);
            rs=pstmt.executeQuery();
            if (rs.next()){
                Integer id = rs.getInt("id");
                String name=rs.getString("username");
                String passwd=rs.getString("passwd");
                user=new User();
                user.setId(id);
                user.setUsername(name);
                user.setPasswd(passwd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}

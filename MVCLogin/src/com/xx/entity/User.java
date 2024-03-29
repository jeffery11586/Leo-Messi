package com.xx.entity;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 15:23
 */
public class User {
    private Integer id;
    private String username;
    private String passwd;

    public User() {
    }

    public User(Integer id, String username, String passwd) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}

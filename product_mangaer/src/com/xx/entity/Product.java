package com.xx.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 1.实现Serializable
 * 2.提供私有属性
 * 3.提供getter/setter
 * 4.提供无参构造
 * javabean:java类，用来表示项目中的一些可以重复使用的组件
 * 广义javabean：指的是java类：servlet、service、dao、entity
 * 狭义javabean：指的是满足1234这几个条件的类
 */

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 19:30
 */
public class Product implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer account;
    private Integer status;
    private Date addtime;

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}

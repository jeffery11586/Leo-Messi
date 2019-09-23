package com.xx.servlet;

import com.xx.entity.User;
import com.xx.service.UserService;
import com.xx.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 16:36
 */
@WebServlet(name = "Servlet",urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//1.获取用户名和密码
        String username = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        System.out.println(username);
        //2.调用Service的根据用户名查询用户对象的方法，返回用户对象
        User user = userService.selectUserByName(username);
        //3.判断如果用户对象为null则请求转发到login.jsp中，否则校验密码，如果校验成功则请求重定向到index.jsp,否则转发到Login.jsp
        if (user!= null) {
            if (passwd.equals(user.getPasswd())) {
                response.sendRedirect("a.jsp");
            } else {
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

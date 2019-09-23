package com.xx.servlet;

import com.xx.service.ProductService;
import com.xx.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-23 10:24
 */
@WebServlet(name = "DelectProductServlet",urlPatterns = "/DelectProductServlet")
public class DelectProductServlet extends HttpServlet {
    private ProductService productService=new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取id
        Integer id = Integer.parseInt(request.getParameter("id")); 
        //2.调用Service的删除方法
        productService.deleteProductById(id);
        //3.请求重定向到查询的Servlet
         response.sendRedirect("QueryProductListServlet");   
   
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

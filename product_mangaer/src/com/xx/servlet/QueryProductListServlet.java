package com.xx.servlet;

import com.xx.entity.Product;
import com.xx.service.ProductService;
import com.xx.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 19:50
 */
@WebServlet(name = "QueryProductListServlet",urlPatterns = "/QueryProductListServlet")
public class QueryProductListServlet extends HttpServlet {
    private   ProductService productService=new ProductServiceImpl();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用service的查询商品的列表的方法，返回商品列表
        List<Product> products=productService.selectAllProduct();
        //2.保存商品列表
        request.setAttribute("products",products);
        //3.请求转发到Product_list.jsp,在页面上显示商品列表和信息
        request.getRequestDispatcher("product_list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

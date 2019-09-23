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

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-23 14:24
 */
@WebServlet(name = "QueryProductByIdServlet",urlPatterns = "/QueryProductByIdServlet")
public class QueryProductByIdServlet extends HttpServlet {
    private ProductService productService=new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取id
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        //2.根据id查询商品信息返回商品对象
        Product product= productService.selectProductById(id);
        //3.保存商品对象
        request.setAttribute("product",product);
        //4.请求转发到Product_update.jsp
        request.getRequestDispatcher("Product_update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

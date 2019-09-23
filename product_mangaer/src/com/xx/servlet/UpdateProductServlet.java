package com.xx.servlet;

import com.xx.entity.Product;
import com.xx.service.ProductService;
import com.xx.service.impl.ProductServiceImpl;

import javax.persistence.Id;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-23 14:57
 */
@WebServlet(name = "UpdateProductServlet",urlPatterns = "/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取jsp的参数
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Integer price = Integer.parseInt(request.getParameter("price"));
        Integer account = Integer.parseInt(request.getParameter("account"));
        Integer status = Integer.parseInt(request.getParameter("status"));
        Integer id = Integer.parseInt(request.getParameter("id"));
        //2.新建商品类，保存商品的信息
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setAccount(account);
        product.setStatus(status);
        product.setPrice(price);
        product.setAddtime(new Date());
        product.setId(id);
        //3.调用Service的addproduct方法
        productService.updateProduct(product);
        //4.重定向到查询的servlet
        response.sendRedirect("QueryProductListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}

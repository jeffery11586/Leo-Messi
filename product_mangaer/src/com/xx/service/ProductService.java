package com.xx.service;

import com.xx.entity.Product;

import java.util.List;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 19:47
 */
public interface ProductService {

     List<Product> selectAllProduct();

     void deleteProductById(Integer id);

     void addProduct(Product product);

     

     Product selectProductById(Integer id);

     void updateProduct(Product product);
}

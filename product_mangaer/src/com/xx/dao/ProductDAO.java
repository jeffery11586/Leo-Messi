package com.xx.dao;

import com.xx.entity.Product;

import java.util.List;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 19:38
 */
public interface ProductDAO {
    
     List<Product> selectAllProduct() ;

     void deleteProductById(Integer id);

     void addProduct(Product product);

     Product selectProductById(Integer id);


     void updateProduct(Product product);
     
}

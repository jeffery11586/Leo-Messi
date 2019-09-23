package com.xx.service.impl;

import com.xx.dao.ProductDAO;
import com.xx.dao.impl.ProductDAOIml;
import com.xx.entity.Product;
import com.xx.service.ProductService;

import java.util.List;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 19:48
 */
public class ProductServiceImpl implements ProductService {
    private  ProductDAO productDAO= new ProductDAOIml();


    @Override
    public List<Product> selectAllProduct() {
        return productDAO.selectAllProduct();
    }

    @Override
    public void deleteProductById(Integer id) {
        productDAO.deleteProductById(id);
    }

    @Override
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

  

    @Override
    public Product selectProductById(Integer id) {
         
        return productDAO.selectProductById(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
    }
}

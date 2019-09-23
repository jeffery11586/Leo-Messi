package com.xx.dao.impl;

import com.xx.dao.ProductDAO;
import com.xx.entity.Product;
import com.xx.util.BaseDAO;

import java.util.List;

/**
 * @Author: Jeffery
 * @CreateTime: 2019-09-22 19:39
 */
public class ProductDAOIml extends BaseDAO implements ProductDAO {
    @Override
    public List<Product> selectAllProduct() {
        //uodate
        
        return findList(Product.class,"select * from jspproduct ");
    }

    @Override
    public void deleteProductById(Integer id) {
        update("delete from jspproduct where id=?",id);
    }

    @Override
    public void addProduct(Product product) {
        update("insert into jspproduct values(null,?,?,?,?,?,?)",product.getName(),product.getDescription(),product.getPrice(),product.getAccount(),product.getStatus(),product.getAddtime());
    }

    @Override
    public Product selectProductById(Integer id) {
        return findOne(Product.class,"select * from jspproduct where id = ?",id);
    }

    @Override
    public void updateProduct(Product product) {
        update("update jspproduct set name=?,description=?,price=?,account=?,status=? where id= ?",product.getName(),product.getDescription(),product.getPrice(),product.getAccount(),product.getStatus(),product.getId());
    }
}

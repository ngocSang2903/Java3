/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo_buoi5;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProductService {
    private ProductRepository productRepository;

    public ProductService() {
        this.productRepository =new ProductRepository();
    }

    public void insert(Product p) {
        productRepository.insert(p);
    }

    public void update(int id, Product p) {
        productRepository.update(id,p);
    }

    public void delete(int id) {
        productRepository.delete(id);
    }

    public ArrayList<Product> getList() {
        return this.productRepository.all();
    }

}

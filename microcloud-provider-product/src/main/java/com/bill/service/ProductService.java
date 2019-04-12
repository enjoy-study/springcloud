package com.bill.service;

import com.bill.model.Product;

import java.util.List;

public interface ProductService {

    Product get(long id);
    boolean add(Product product);
    List<Product> list();
}

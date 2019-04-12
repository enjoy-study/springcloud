package com.bill.service.impl;

import com.bill.mapper.ProductMapper;
import com.bill.model.Product;
import com.bill.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IProductService implements ProductService {

    @Resource
    ProductMapper productMapper;

    @Override
    public Product get(long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean add(Product product) {
        int count = productMapper.insert(product);
        if(count <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public List<Product> list() {
        return productMapper.selectAll();
    }
}

package com.bill.mapper;

import com.bill.model.Product;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Long prodcutId);

    int insert(Product record);

    Product selectByPrimaryKey(Long prodcutId);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);
}
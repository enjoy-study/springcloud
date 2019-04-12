package com.bill.controller;

import com.bill.model.Product;
import com.bill.service.impl.IProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private IProductService productService;

    @RequestMapping(value = "get/{id}")
    public Object get(@PathVariable("id") long id) {
        return productService.get(id);
    }

    @RequestMapping(value = "/list")
    public Object list() {
        return productService.list();
    }

    @RequestMapping(value = "/add")
    public Object add(@RequestBody Product product) {
        return productService.add(product);
    }

}

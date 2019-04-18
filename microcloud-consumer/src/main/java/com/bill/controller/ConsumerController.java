package com.bill.controller;

import com.bill.vo.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    public RestTemplate restTemplate;

    @Resource
    public HttpHeaders httpHeaders;

    public static final String LIST_URI = new String("http://localhost:8080/microcloud-provider-product/product/list");
    public static final String GET_URI = new String("http://localhost:8080/microcloud-provider-product/product/get/");
    public static final String ADD_URI = new String("http://localhost:8080/microcloud-provider-product/product/add");

    @RequestMapping("/product/list")
    public Object list() {
//        return restTemplate.exchange(LIST_URI, HttpMethod.GET, null, List.class).getBody();
        return restTemplate.exchange(LIST_URI, HttpMethod.GET, new HttpEntity<Object>(httpHeaders), List.class).getBody();
    }

    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        return restTemplate.exchange(GET_URI + id, HttpMethod.GET, new HttpEntity<Object>(httpHeaders), Product.class, id).getBody();
    }

    @RequestMapping("/product/add")
    public Object addProduct(Product product) {
        return restTemplate.exchange(ADD_URI, HttpMethod.POST, new HttpEntity<Object>(product,httpHeaders), Boolean.class).getBody();
    }


}

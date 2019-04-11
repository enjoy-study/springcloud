package com.bill.model;

public class Product extends BaseEntity {
    private Long prodcutId;

    private String productName;

    private String productDesc;

    public Long getProdcutId() {
        return prodcutId;
    }

    public void setProdcutId(Long prodcutId) {
        this.prodcutId = prodcutId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodcutId=" + prodcutId +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }
}
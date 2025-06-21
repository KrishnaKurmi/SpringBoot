package com.second.secondbatchVeer.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productno;
    String productname,category;
    boolean isavailable;

    public Products() {
    }

    public Products(int productno, String productname, String category, boolean isavailable) {
        this.productno = productno;
        this.productname = productname;
        this.category = category;
        this.isavailable = isavailable;
    }

    public int getProductno() {
        return productno;
    }

    public void setProductno(int productno) {
        this.productno = productno;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }
}

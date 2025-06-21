package com.second.secondbatchVeer.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    ProductsRepository productsRepository;

    @GetMapping("/addproduct")
    public String add() {
        return "addproduct";
    }

    @PostMapping("/saveproduct")
    public String save(String productname, String category,boolean isavailable){
        Products products = new Products();
        products.setProductname(productname);
        products.setCategory(category);
        products.setIsavailable(isavailable);
        productsRepository.save(products);
        return "confirmation";

    }
}

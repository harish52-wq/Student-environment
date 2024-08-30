package com.example.simpleWeb.controller;

import com.example.simpleWeb.model.Product;
import com.example.simpleWeb.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {
    @Autowired
    ProductsService product;
    @GetMapping("/products")
    public List<Product> getProducts(){
        return product.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProductsById(@PathVariable int id){

        return product.getProductById(id);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        product.addProducts(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        product.updateProduct(prod);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProducts(@PathVariable int id){
        product.deleteProduct(id);
    }
}

package com.example.simpleWeb.service;

import com.example.simpleWeb.model.Product;
import com.example.simpleWeb.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import java.util.*;
import com.example.simpleWeb.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
        import java.util.List;
@Service
public class ProductsService {
    @Autowired
    ProductRepo repo;
   // List<Product> products=new ArrayList<>( Arrays.asList(
     //       new Product(101,"phone",500),
     //       new Product(102,"mobile",100),
     //       new Product(103,"charger",200)
    //));
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id){
       return repo.findById(id).orElse(new Product());
    }
    public void addProducts(Product prod){
        repo.save(prod);
    }
    public void updateProduct(Product prod){
       repo.save(prod);
    }

    public void deleteProduct(int id) {
       repo.deleteById(id);
    }
}

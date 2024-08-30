package com.example.simpleWeb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;


    public Product() {

    }
}

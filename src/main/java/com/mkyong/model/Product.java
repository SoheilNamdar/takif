package com.mkyong.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "price")
    private double value;


    public Product(double baseValue) {
        value = baseValue;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public double prix() {
        return value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "valeur=" + value +
                '}';
    }
}

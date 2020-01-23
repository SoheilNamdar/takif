package com.mkyong.model;

import javax.persistence.*;
import java.util.List;

@Entity
abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "price")
    private final double value ;


    public Product(double baseValue) {
        value = baseValue;
    }

    public Product() { value = 0.0; }

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
        return Double.toString(prix());
    }
}

package com.mkyong.model;

import com.mkyong.entity.TermStudentCorse;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double valeur;

    @OneToMany(mappedBy = "sacSara")
    private List<ProductSacMecanismeAccessoire> productSacMecanismeAccessoire;

    public Product(double baseValue) {
        valeur = baseValue;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public double getValeur() {
        return valeur;
    }

    public double prix() {
        return valeur;
    }

    @Override
    public String toString() {
        return "Product{" +
                "valeur=" + valeur +
                '}';
    }
}

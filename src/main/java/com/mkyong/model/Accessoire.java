package com.mkyong.model;

import javax.persistence.*;

@Entity
public class Accessoire extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;



    public Accessoire(String name, double valeurDeBase) {
        super(valeurDeBase);
        this.name = name;
    }

    @Override
    public String toString() {
        String result = name + " costs ";
        result += super.toString();
        return result;
    }
}

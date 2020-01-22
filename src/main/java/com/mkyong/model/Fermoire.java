package com.mkyong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fermoire extends Accessoire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Fermoire(String name, double valeurDeBase) {
        super("fermoire" + name, valeurDeBase);
    }
}

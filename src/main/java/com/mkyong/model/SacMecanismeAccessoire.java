package com.mkyong.model;

import javax.persistence.*;

@Entity
public class SacMecanismeAccessoire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Mecanisme sacMecanisme;
    @ManyToOne
    private Accessoire sacAccessoire;
}


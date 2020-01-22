package com.mkyong.model;

import javax.persistence.*;

@Entity
public class ProductSacMecanismeAccessoire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Sac sacTakif;
    @ManyToOne
    private Mecanisme mecZananeh;
    @ManyToOne
    private Accessoire accBandeKif;

}

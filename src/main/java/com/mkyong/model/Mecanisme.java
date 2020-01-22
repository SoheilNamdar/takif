package com.mkyong.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mecanisme extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "mecanismeMardaneh")
    private List<Sac> sacs;

}

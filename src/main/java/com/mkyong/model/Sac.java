package com.mkyong.model;

import com.mkyong.entity.TermStudentCorse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sac extends Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private final String name;
    @Column(name = "mecanisme")
    private Mecanisme coeur;
    @Column(name = "accessoire")
    private ArrayList<Accessoire> accessoires;

    @OneToMany(mappedBy = "sacSara")
    private List<Mecanisme> mecanisme;

    @OneToMany(mappedBy = "sacSara")
    private List<Accessoire> accessoire;

    public Sac(String unNom, double baseValue) {
        super(baseValue);
        this.name = unNom;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Mecanisme getCoeur() {
        return coeur;
    }

    public ArrayList<Accessoire> getAccessoires() {
        return accessoires;
    }

    public void ajouter(Accessoire accessoire) {
        accessoires.add(accessoire);
    }

    @Override
    public double prix() {
        //At first the price is the basic price
        double finalPrice = super.prix();

        for (Accessoire acc : accessoires) {
            finalPrice += acc.prix();
        }
        return finalPrice;
    }

    public void afficher() {
        System.out.println("One sac composed of :");

        for (Accessoire acc : accessoires) {
            System.out.println("  *  " + acc);
        }

        System.out.println("==> Total Price : " + prix());
    }
}

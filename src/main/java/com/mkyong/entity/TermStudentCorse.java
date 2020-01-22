package com.mkyong.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TermStudentCorse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    private Term termabbas;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Corse corse;
    @ManyToOne
    private Techer techer;

}

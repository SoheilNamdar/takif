package com.mkyong.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Term {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "termabbas")
    private List<TermStudentCorse> termStudentCorses;
}

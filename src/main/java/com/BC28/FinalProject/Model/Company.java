package com.BC28.FinalProject.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCompany;

    @Column
    private String name;

    @Column
    private Integer typeDoc;

    @Column
    private  String ruc;
}

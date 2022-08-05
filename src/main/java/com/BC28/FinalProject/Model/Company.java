package com.BC28.FinalProject.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Company {

    @Id
    private Integer idCompany;

    @Column
    private String name;

    @Column
    private Integer typeDoc;

    @Column
    private  String ruc;
}

package com.BC28.FinalProject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    private Integer idCompany;

    @Column
    private String name;

    @Column
    private Integer typeDoc;

    @Column
    private  String ruc;

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

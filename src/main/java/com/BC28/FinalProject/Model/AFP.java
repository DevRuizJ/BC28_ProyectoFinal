package com.BC28.FinalProject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AFP {
    @Id
    private Integer idAFP;

    @Column
    private String name;

    public Integer getIdAFP() {
        return idAFP;
    }

    public void setIdAFP(Integer idAFP) {
        this.idAFP = idAFP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

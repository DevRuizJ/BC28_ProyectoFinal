package com.BC28.FinalProject.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
public class Afp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAfp;

    @Column
    private Integer idCompany;

    public Integer getIdAfp() {
        return idAfp;
    }

    public void setIdAFP(Integer idAFP) {
        this.idAfp = idAfp;
    }

    public void setIdAfp(Integer idAfp) {
        this.idAfp = idAfp;
    }

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }
}

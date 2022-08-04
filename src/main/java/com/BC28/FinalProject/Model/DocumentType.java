package com.BC28.FinalProject.Model;

import javax.persistence.*;

@Entity
public class DocumentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDocType;

    @Column
    private String name;

    public Integer getIdDocType() {
        return idDocType;
    }

    public void setIdDocType(Integer idDocType) {
        this.idDocType = idDocType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

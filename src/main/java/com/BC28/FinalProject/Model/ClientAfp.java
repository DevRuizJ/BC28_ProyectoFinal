package com.BC28.FinalProject.Model;

import javax.persistence.*;

@Entity
@Table(name = "client_afp")
public class ClientAfp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliAfp;

    @Column
    private Integer idClient;

    @Column
    private Integer idAfp;

    @Column
    private Double total;

    public Integer getIdCliAfp() {
        return idCliAfp;
    }

    public void setIdCliAfp(Integer idCliAfp) {
        this.idCliAfp = idCliAfp;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(Integer idAfp) {
        this.idAfp = idAfp;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}

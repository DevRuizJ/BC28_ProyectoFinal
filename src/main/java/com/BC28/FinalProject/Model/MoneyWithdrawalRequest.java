package com.BC28.FinalProject.Model;

import javax.persistence.*;

@Entity
public class MoneyWithdrawalRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idWithdrawal;

    @Column
    private Integer idClient;

    @Column
    private Integer idAfp;

    public Integer getIdWithdrawal() {
        return idWithdrawal;
    }

    public void setIdWithdrawal(Integer idWithdrawal) {
        this.idWithdrawal = idWithdrawal;
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
}

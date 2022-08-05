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
    private Integer idCompany;

    @Column
    private Integer idAfp;

    @Column
    private Double totalWithdrawal;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }

    public Integer getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(Integer idAfp) {
        this.idAfp = idAfp;
    }

    public Double getTotalWithdrawal() {
        return totalWithdrawal;
    }

    public void setTotalWithdrawal(Double totalWithdrawal) {
        this.totalWithdrawal = totalWithdrawal;
    }

    public Integer getIdWithdrawal() {
        return idWithdrawal;
    }

    public void setIdWithdrawal(Integer idWithdrawal) {
        this.idWithdrawal = idWithdrawal;
    }
}

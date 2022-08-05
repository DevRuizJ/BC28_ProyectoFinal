package com.BC28.FinalProject.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
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
}

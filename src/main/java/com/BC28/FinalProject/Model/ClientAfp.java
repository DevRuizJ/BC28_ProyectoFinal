package com.BC28.FinalProject.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "client_afp")
public class ClientAfp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliAfp;

    @Column
    private Integer idClient;

    @Column
    private Integer idCompany;

    @Column
    private Integer idAfp;

    @Column
    private Double total;

}

package com.BC28.FinalProject.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Afp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAfp;

    @Column
    private Integer idCompany;
}

package com.BC28.FinalProject.Repository;

import com.BC28.FinalProject.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Integer> {
}

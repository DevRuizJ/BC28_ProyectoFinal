package com.BC28.FinalProject.Repository;

import com.BC28.FinalProject.Model.Afp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAfpRepository extends JpaRepository<Afp, Integer> {
}

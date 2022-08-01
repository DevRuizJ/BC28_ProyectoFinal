package com.BC28.FinalProject.Repository;

import com.BC28.FinalProject.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyRepository extends JpaRepository<Company, Integer> {
}

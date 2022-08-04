package com.BC28.FinalProject.Repository;

import com.BC28.FinalProject.Model.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentTypeRepository extends JpaRepository<DocumentType, Integer> {
}

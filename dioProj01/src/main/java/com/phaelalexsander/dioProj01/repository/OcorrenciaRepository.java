package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
    
}

package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
    
}

package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
    
}

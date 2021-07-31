package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.JornadaDeTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaDeTrabalho, Long> {
}

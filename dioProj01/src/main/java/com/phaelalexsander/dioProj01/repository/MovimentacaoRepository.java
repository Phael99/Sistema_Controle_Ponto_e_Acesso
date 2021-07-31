package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
    
}

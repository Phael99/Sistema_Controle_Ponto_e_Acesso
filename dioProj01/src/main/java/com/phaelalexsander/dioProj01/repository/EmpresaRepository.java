package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    
}

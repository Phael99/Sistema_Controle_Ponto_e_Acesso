package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
    
}

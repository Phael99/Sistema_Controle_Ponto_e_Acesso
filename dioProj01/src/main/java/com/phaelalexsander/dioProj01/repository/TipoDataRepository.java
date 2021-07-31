package com.phaelalexsander.dioProj01.repository;

import com.phaelalexsander.dioProj01.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}

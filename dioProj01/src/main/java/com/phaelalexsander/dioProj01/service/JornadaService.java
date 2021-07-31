package com.phaelalexsander.dioProj01.service;

import com.phaelalexsander.dioProj01.model.JornadaDeTrabalho;
import com.phaelalexsander.dioProj01.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaDeTrabalho saveJornada(JornadaDeTrabalho jornadaDeTrabalho){
       return jornadaRepository.save(jornadaDeTrabalho);
    }

    public List<JornadaDeTrabalho> findAll() {
        return jornadaRepository.findAll();
    }


    public Optional<JornadaDeTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaDeTrabalho updateJornada(JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaRepository.save(jornadaDeTrabalho);
    }

    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}

package com.phaelalexsander.dioProj01.controller;

import com.phaelalexsander.dioProj01.model.JornadaDeTrabalho;
import com.phaelalexsander.dioProj01.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaDeTrabalho createJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaService.saveJornada(jornadaDeTrabalho);
    }

    @GetMapping
    public List<JornadaDeTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaDeTrabalho> getJornadaById(@PathVariable("idJornada") long idJornada){

        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not Found !")));
    }

    @PutMapping
    public JornadaDeTrabalho updateJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho){
        return jornadaService.updateJornada(jornadaDeTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<JornadaDeTrabalho> deleteJornadaById(@PathVariable("idJornada") long idJornada){
            jornadaService.deleteJornada(idJornada);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

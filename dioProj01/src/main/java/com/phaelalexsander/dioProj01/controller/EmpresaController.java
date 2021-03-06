package com.phaelalexsander.dioProj01.controller;

import com.phaelalexsander.dioProj01.model.Empresa;
import com.phaelalexsander.dioProj01.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idEmpresa") long idEmpresa){

        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new NoSuchElementException("Not Found !")));
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> deleteEmpresaById(@PathVariable("idEmpresa") long idEmpresa){
        empresaService.deleteEmpresa(idEmpresa);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

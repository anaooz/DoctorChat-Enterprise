package com.challenge.doctorchat.App.controllers;

import com.challenge.doctorchat.App.exceptions.RestNotFoundException;
import com.challenge.doctorchat.Core.entities.Medico;
import com.challenge.doctorchat.Core.entities.Usuario;
import com.challenge.doctorchat.Core.valueObjects.CPF;
import com.challenge.doctorchat.Details.repositories.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/medico")
public class MedicoController {
    @Autowired
    MedicoRepository medicoRepository;

    @GetMapping
    @Cacheable("medicos")
    public Iterable<Medico> index() {
        return medicoRepository.findAll();
    }

    @GetMapping("/{id}")
    @Cacheable("medicos")
    public Optional<Medico> getMedicoById(@PathVariable Long id) {
        return medicoRepository.findById(id);
    }

    @PostMapping
    public Medico create(@RequestBody @Valid Medico medico) {
        return medicoRepository.save(medico);
    }

    @PutMapping("/{id}")
    public Medico updateMedico(@PathVariable Long id, @RequestBody Medico medico) {
        medicoRepository.findById(id)
                .orElseThrow(() -> new RestNotFoundException("Médico não encontrado, erro ao atualizar"));
        medico.setId(id);
        return medicoRepository.save(medico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        medicoRepository.findById(id)
                .orElseThrow(() -> new RestNotFoundException("Médico não encontrado, erro ao deletar"));
        medicoRepository.deleteById(id);
    }
}

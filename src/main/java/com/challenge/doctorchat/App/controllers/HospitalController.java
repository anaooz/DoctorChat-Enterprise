package com.challenge.doctorchat.App.controllers;

import com.challenge.doctorchat.App.exceptions.RestNotFoundException;
import com.challenge.doctorchat.Core.entities.Hospital;
import com.challenge.doctorchat.Core.entities.Medico;
import com.challenge.doctorchat.Details.repositories.HospitalRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    private final HospitalRepository hospitalRepository;

    @Autowired
    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping
    @Cacheable("hospitais")
    public Iterable<Hospital> index() {
        return hospitalRepository.findAll();
    }

    @GetMapping("/{id}")
    @Cacheable("hospitais")
    public Optional<Hospital> getHospitalById(@PathVariable Long id) {
        return hospitalRepository.findById(id);
    }

    @PostMapping
    public Hospital create(@RequestBody @Valid Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    @PutMapping("/{id}")
    public Hospital updateHospital(@PathVariable Long id, @RequestBody Hospital hospital) {
        hospitalRepository.findById(id)
                .orElseThrow(() -> new RestNotFoundException("Hospital não encontrado, erro ao atualizar"));
        hospital.setId(id);
        return hospitalRepository.save(hospital);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        hospitalRepository.findById(id)
                .orElseThrow(() -> new RestNotFoundException("Hospital não encontrado, erro ao deletar"));
        hospitalRepository.deleteById(id);
    }
}

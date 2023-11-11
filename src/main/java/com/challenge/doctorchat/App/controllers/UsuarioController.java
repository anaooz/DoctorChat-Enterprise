package com.challenge.doctorchat.App.controllers;

import com.challenge.doctorchat.App.exceptions.RestNotFoundException;
import com.challenge.doctorchat.Core.entities.Usuario;
import com.challenge.doctorchat.Core.valueObjects.CPF;
import com.challenge.doctorchat.Details.repositories.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    @Cacheable("usuarios")
    public Iterable<Usuario> index() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{cpf}")
    @Cacheable("usuarios")
    public Usuario getUsuarioByCPF(@PathVariable CPF cpf) {
        return usuarioRepository.findByCPF(cpf);
    }

    @PostMapping
    public Usuario create(@RequestBody @Valid Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuarioRepository.findById(id).orElseThrow(() -> new RestNotFoundException("Usuário não encontrado, erro ao atualizar"));
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        usuarioRepository.findById(id).orElseThrow(() -> new RestNotFoundException("Usuário não encontrado, erro ao deletar"));
        usuarioRepository.deleteById(id);
    }
}

package com.challenge.doctorchat.Core.interfaces;

import com.challenge.doctorchat.Core.entities.Usuario;
import com.challenge.doctorchat.Core.valueObjects.CPF;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class CustomUsuarioRepositoryImpl implements CustomUsuarioRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Usuario findByCPF(CPF CPF) {
        return (Usuario) entityManager.createQuery("SELECT u FROM Usuario u WHERE u.CPF = :CPF")
                .setParameter("CPF", CPF)
                .getSingleResult();
    }
}

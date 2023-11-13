package com.challenge.doctorchat.Details.repositories;

import com.challenge.doctorchat.Core.entities.Usuario;
import com.challenge.doctorchat.Core.interfaces.CustomUsuarioRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>, CustomUsuarioRepository {

}

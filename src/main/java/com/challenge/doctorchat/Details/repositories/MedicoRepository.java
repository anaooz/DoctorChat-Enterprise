package com.challenge.doctorchat.Details.repositories;

import com.challenge.doctorchat.Core.entities.Medico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Long> {

}

package com.challenge.doctorchat.Details.repositories;

import com.challenge.doctorchat.Core.entities.Hospital;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital,Long> {

}

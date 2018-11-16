package com.privalia.examen.repository;

import com.privalia.examen.model.Policy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyDbRepository extends CrudRepository<Policy, String> {
}

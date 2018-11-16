package com.privalia.examen.repository;

import com.privalia.examen.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDbRepository extends JpaRepository<Client, String> {

    Client getOneByName(String name);
    Client getOneById(String id);
    Client getOneByEmail(String email);

    List<Client> getAllByRole(String role);
}

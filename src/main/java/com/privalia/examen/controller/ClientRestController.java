package com.privalia.examen.controller;

import com.privalia.examen.model.Client;
import com.privalia.examen.model.Clients;
import com.privalia.examen.repository.ClientDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientRestController {

    @Autowired
    ClientDbRepository clientDbRepository;

    @GetMapping
    public Clients getAllClients() {
        Clients clients = new Clients();
        clients.setClients(clientDbRepository.findAll());

        return clients;
    }

    @GetMapping("/id/{id}")
    public Client getClientById(@PathVariable String id) {
        return clientDbRepository.getOneById(id);
    }

    @GetMapping("/name/{name}")
    public Client getByName(@PathVariable String name) {
        return clientDbRepository.getOneByName(name);
    }

    @GetMapping("email/{email}")
    public Client getByEmail(@PathVariable String email) {
        return clientDbRepository.getOneByEmail(email);
    }

    @GetMapping("/role/{role}")
    public List<Client> getByRole(@PathVariable String role) {
        return clientDbRepository.getAllByRole(role);
    }

}

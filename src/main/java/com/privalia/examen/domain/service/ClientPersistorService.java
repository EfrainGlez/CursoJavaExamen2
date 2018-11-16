package com.privalia.examen.domain.service;

import com.privalia.examen.Application;
import com.privalia.examen.model.Client;
import com.privalia.examen.model.Clients;
import com.privalia.examen.repository.ClientsHttpRepository;
import com.privalia.examen.repository.ClientDbRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientPersistorService {

    @Autowired
    ClientDbRepository clientDbRepository;

    private ClientsHttpRepository clientsHttpRepository;

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public ClientPersistorService() {
        clientsHttpRepository = new ClientsHttpRepository();
    }

    public void readAndPersistClients() {

        Clients clients = clientsHttpRepository.getClientsFromHttp();

        log.info(clients.toString());

        clientDbRepository.save(clients.getClients());
    }
}

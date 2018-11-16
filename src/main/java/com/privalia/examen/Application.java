package com.privalia.examen;

import com.privalia.examen.domain.service.ClientPersistorService;
import com.privalia.examen.domain.service.PolicyPersistorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    public ClientPersistorService clientPersistorService;

    @Autowired
    public PolicyPersistorService policyPersistorService;

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        clientPersistorService.readAndPersistClients();
        policyPersistorService.readAndPersistPolicies();


    }
}

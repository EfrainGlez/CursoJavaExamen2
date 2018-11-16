package com.privalia.examen.domain.service;

import com.privalia.examen.Application;
import com.privalia.examen.model.Client;
import com.privalia.examen.model.Clients;
import com.privalia.examen.model.Policies;
import com.privalia.examen.model.Policy;
import com.privalia.examen.repository.PoliciesHttpRepository;
import com.privalia.examen.repository.PolicyDbRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PolicyPersistorService {

    @Autowired
    PolicyDbRepository policyDbRepository;

    private PoliciesHttpRepository policiesHttpRepository;

    private static final Logger log = LoggerFactory.getLogger(Application.class);


    public PolicyPersistorService() {
        policiesHttpRepository = new PoliciesHttpRepository();
    }

    public void readAndPersistPolicies() {

        Policies policies = policiesHttpRepository.getPoliciesFromHttp();

        log.info(policies.toString());

        policyDbRepository.save(policies.getPolicies());
    }
}

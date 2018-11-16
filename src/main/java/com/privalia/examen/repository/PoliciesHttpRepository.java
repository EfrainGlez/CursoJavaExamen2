package com.privalia.examen.repository;

import com.privalia.examen.model.Policies;
import org.springframework.web.client.RestTemplate;

public class PoliciesHttpRepository {

    public Policies getPoliciesFromHttp() {

        final String uri = "http://www.mocky.io/v2/580891a4100000e8242b75c5";

        RestTemplate restTemplate = new RestTemplate();

        Policies result = restTemplate.getForObject(uri, Policies.class);

        return result;
    }
}

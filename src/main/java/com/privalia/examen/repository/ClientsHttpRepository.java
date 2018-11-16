package com.privalia.examen.repository;

import com.privalia.examen.model.Clients;
import org.springframework.web.client.RestTemplate;

public class ClientsHttpRepository {

    public Clients getClientsFromHttp() {

        final String uri = "http://www.mocky.io/v2/5808862710000087232b75ac";

        RestTemplate restTemplate = new RestTemplate();

        Clients result = restTemplate.getForObject(uri, Clients.class);

        return result;
    }
}

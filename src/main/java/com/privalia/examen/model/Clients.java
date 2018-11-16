package com.privalia.examen.model;

import java.util.Arrays;
import java.util.List;

public class Clients {

    private List<Client> clients;

    public Clients() {
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "clients=" + clients +
                '}';
    }

//    public Client[] getClients() {
//        return clients;
//    }
//
//    public void setClients(Client[] clients) {
//        this.clients = clients;
//    }
//
//    @Override
//    public String toString() {
//        return "Clients{" +
//                "clients=" + Arrays.toString(clients) +
//                '}';
//    }
}

package com.privalia.examen.model;

import java.util.Arrays;
import java.util.List;

public class Policies {

    List<Policy> policies;

    public Policies() {
    }


    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        return "Policies{" +
                "policies=" + policies +
                '}';
    }
}

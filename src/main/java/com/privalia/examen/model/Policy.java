package com.privalia.examen.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Policy {

    @Id
    private String id;

    @Column(name="amount_insured")
    private BigDecimal amountInsured;

    private String email;

    @Column(name="inception_date")
    private String inceptionDate;

    @Column(name="installment_payment")
    private Boolean installmentPayment;

    @Column(name="client_id")
    private String clientId;

    public Policy() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmountInsured() {
        return amountInsured;
    }

    public void setAmountInsured(BigDecimal amountInsured) {
        this.amountInsured = amountInsured;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(String inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public Boolean getInstallmentPayment() {
        return installmentPayment;
    }

    public void setInstallmentPayment(Boolean installmentPayment) {
        this.installmentPayment = installmentPayment;
    }

    public String getClient() {
        return clientId;
    }

    public void setClientId(String client) {
        this.clientId = client;
    }

    @Override
    public String toString() {
        return "com.privalia.examen.model.Policy{" +
                "id='" + id + '\'' +
                ", amountInsured=" + amountInsured +
                ", email='" + email + '\'' +
                ", inceptionDate='" + inceptionDate + '\'' +
                ", installmentPayment=" + installmentPayment +
                ", clientId=" + clientId +
                '}';
    }
}

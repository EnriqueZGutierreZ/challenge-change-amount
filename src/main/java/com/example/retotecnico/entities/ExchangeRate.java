package com.example.retotecnico.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Indica que el valor de este campo se generará automáticamente.
    private Long id;  // El identificador único de la tasa de cambio.

    // Atributo que representa la moneda de origen en la conversión.
    private String sourceCurrency;

    // Atributo que representa la moneda de destino en la conversión.
    private String targetCurrency;

    // Atributo que representa la tasa de cambio entre la moneda de origen y la de destino.
    private double rate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

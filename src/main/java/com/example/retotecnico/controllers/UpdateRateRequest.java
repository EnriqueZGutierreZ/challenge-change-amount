package com.example.retotecnico.controllers;

public class UpdateRateRequest {
    // Atributos que representan los datos necesarios para solicitar una actualización de la tasa de cambio
    private String sourceCurrency;    // Moneda de origen que se desea actualizar.
    private String targetCurrency;    // Moneda de destino que se desea actualizar.
    private double newRate;           // Nueva tasa de cambio que se desea establecer entre las monedas.


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

    public double getNewRate() {
        return newRate;
    }

    public void setNewRate(double newRate) {
        this.newRate = newRate;
    }
}
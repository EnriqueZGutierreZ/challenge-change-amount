package com.example.retotecnico.controllers;

public class ExchangeResponse {

    // Atributos que representan los datos de la respuesta de conversión de divisas
    private double amount;            // Cantidad original que se desea convertir
    private double convertedAmount;   // Cantidad convertida después de aplicar la tasa de cambio
    private String sourceCurrency;    // Moneda de origen
    private String targetCurrency;    // Moneda de destino
    private double rate;              // Tasa de cambio utilizada para la conversión

    public ExchangeResponse(double amount, double convertedAmount, String sourceCurrency, String targetCurrency, double rate) {
        this.amount = amount;
        this.convertedAmount = convertedAmount;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
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
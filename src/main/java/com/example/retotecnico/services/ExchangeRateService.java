package com.example.retotecnico.services;

import com.example.retotecnico.entities.ExchangeRate;
import com.example.retotecnico.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExchangeRateService {

    @Autowired
    private ExchangeRateRepository repository;

    public double getExchangeRate(String sourceCurrency, String targetCurrency) {
        Optional<ExchangeRate> rate = repository.findBySourceCurrencyAndTargetCurrency(sourceCurrency, targetCurrency);
        return rate.map(ExchangeRate::getRate).orElseThrow(() -> new RuntimeException("Exchange rate not found"));
    }

    public ExchangeRate updateExchangeRate(String sourceCurrency, String targetCurrency, double newRate) {
        ExchangeRate rate = repository.findBySourceCurrencyAndTargetCurrency(sourceCurrency, targetCurrency)
                .orElseThrow(() -> new RuntimeException("Exchange rate not found"));
        rate.setRate(newRate);
        return repository.save(rate);
    }
}
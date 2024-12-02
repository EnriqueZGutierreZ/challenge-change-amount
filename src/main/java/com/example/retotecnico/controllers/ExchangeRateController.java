package com.example.retotecnico.controllers;

import com.example.retotecnico.entities.ExchangeRate;
import com.example.retotecnico.services.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchange")
public class ExchangeRateController {

    // Inyección de dependencia del servicio encargado de las tasas de cambio.
    @Autowired
    private ExchangeRateService service;

    /**
     * Método para convertir una cantidad de dinero de una moneda a otra.
     * Recibe una solicitud POST con la cantidad, la moneda de origen y la moneda de destino.
     */
    @PostMapping("/convert")
    public ExchangeResponse convert(@RequestBody ExchangeRequest request) {
        // Obtiene la tasa de cambio entre la moneda de origen y la moneda de destino.
        double rate = service.getExchangeRate(request.getSourceCurrency(), request.getTargetCurrency());

        // Calcula la cantidad convertida multiplicando la cantidad solicitada por la tasa de cambio.
        double convertedAmount = request.getAmount() * rate;

        // Devuelve un objeto ExchangeResponse con la cantidad original, la cantidad convertida, las monedas y la tasa de cambio.
        return new ExchangeResponse(
                request.getAmount(), // Cantidad original
                convertedAmount,     // Cantidad convertida
                request.getSourceCurrency(), // Moneda de origen
                request.getTargetCurrency(), // Moneda de destino
                rate                // Tasa de cambio utilizada
        );
    }

    /**
     * Método para actualizar la tasa de cambio entre dos monedas.
     * Recibe una solicitud POST con la nueva tasa de cambio para las monedas especificadas.
     */
    @PostMapping("/update")
    public ExchangeRate updateRate(@RequestBody UpdateRateRequest request) {
        // Llama al servicio para actualizar la tasa de cambio entre las monedas de origen y destino con la nueva tasa proporcionada.
        return service.updateExchangeRate(
                request.getSourceCurrency(), // Moneda de origen
                request.getTargetCurrency(), // Moneda de destino
                request.getNewRate()         // Nueva tasa de cambio
        );
    }
}

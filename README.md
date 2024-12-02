# challenge-change-amount
La API debe recibir el valor “monto”, “moneda origen”, “moneda destino”. La API debe devolver el “monto”, “monto con tipo de cambio”, “moneda origen”, “moneda destino” y “tipo de cambio”. Se debe crear la información del tipo de cambio en una in memory database, por ejemplo H2.


Crear un POST para actualizar el valor del tipo de cambio.
En caso de alguna duda en el enunciado, tomar una decisión y luego sustentarla durante la entrevista.

POST: localhost:8080/api/exchange/convert
Body:
{
  "amount": 100,
  "sourceCurrency": "USD",
  "targetCurrency": "EUR"
}

POST: localhost:8080/api/exchange/update
Body:
{
  "sourceCurrency": "USD",
  "targetCurrency": "EUR",
  "newRate": 0.90
}

SQL:
INSERT INTO exchange_rate (source_currency, target_currency, rate) VALUES ('USD', 'EUR', 0.85);
INSERT INTO exchange_rate (source_currency, target_currency, rate) VALUES ('EUR', 'USD', 1.18);
INSERT INTO exchange_rate (source_currency, target_currency, rate) VALUES ('USD', 'JPY', 110.0);
INSERT INTO exchange_rate (source_currency, target_currency, rate) VALUES ('JPY', 'USD', 0.0091);

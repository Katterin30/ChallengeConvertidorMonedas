package com.challenge.conversor;

import org.json.JSONObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class ActualizadorTasas {
    private HashMap<String, Double> tasas;
    private static final String API_KEY = "241f07b0371df03af7253122";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";
    private final HttpClient client;

    public ActualizadorTasas() {
        tasas = new HashMap<>();
        client = HttpClient.newHttpClient();
    }

    public double obtenerTasa(String parMonedas) {
        return tasas.getOrDefault(parMonedas, 1.0);
    }

    public double obtenerTasaV2(String moneda) {
        double tasa = 1.0;
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Imprimir respuesta de la API

            JSONObject jsonObject = new JSONObject(response.body());
            JSONObject rates = jsonObject.getJSONObject("conversion_rates");

            tasa = rates.optDouble(moneda, 1.0);
        } catch (Exception e) {
            System.out.println("Error al actualizar las tasas de cambio: " + e.getMessage());
        }
        return tasa;
    }

    public void actualizarTasas() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject jsonObject = new JSONObject(response.body());
            JSONObject rates = jsonObject.getJSONObject("conversion_rates");

            tasas.put("PEN", rates.optDouble("PEN",1.0));
            tasas.put("USD", rates.optDouble("USD",1.0));
            tasas.put("EUR", rates.optDouble("EUR",1.0));
            tasas.put("CLP", rates.optDouble("CLP",1.0));
            tasas.put("COP", rates.optDouble("COP",1.0));
            tasas.put("VES_PA", rates.optDouble("VES_PA",1.0));

            System.out.println("Tasas de cambio actualizadas desde la API.");

        } catch (Exception e) {
            System.out.println("Error al actualizar las tasas de cambio: " + e.getMessage());
        }
    }
}
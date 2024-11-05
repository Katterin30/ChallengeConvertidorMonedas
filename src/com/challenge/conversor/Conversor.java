package com.challenge.conversor;

import java.util.HashMap;

public class Conversor implements Convertible {
    private ActualizadorTasas actualizadorTasas;
    public HashMap<Integer, String> monedasDisponibles;

    public Conversor(){
        actualizadorTasas = new ActualizadorTasas();
        monedasDisponibles = new HashMap<>();
        monedasDisponibles.put(1, "PEN");
        monedasDisponibles.put(2, "USD");
        monedasDisponibles.put(3, "EUR");
        monedasDisponibles.put(4, "CLP");
        monedasDisponibles.put(5, "COP");
        monedasDisponibles.put(6, "VES_PA");
    }

    @Override
    public double convertir(double cantidad, double tasaDeCambio) {
        return cantidad *tasaDeCambio;
    }

    // Metodo para actualizar tasa desde la API

    public void  actualizarTasas(){
        actualizadorTasas.actualizarTasas();
    }
    // Metodo para obtener la tasa de cambio según las monedas seleccionadas

    public double obtenerTasa(int monedaOrigen, int monedaDestino) {
        double tasaOrigen = actualizadorTasas.obtenerTasaV2(monedasDisponibles.get(monedaOrigen));
        double tasaDestino = actualizadorTasas.obtenerTasaV2(monedasDisponibles.get(monedaDestino));
        double tasa = tasaDestino / tasaOrigen;
            return tasa;

    }

    public double obtenerTasa(int opcion) {
        String parMonedas = switch (opcion){

            case 1->"PEN-USD";
            case 2->"USD-PEN";
            case 3-> "PEN-EUR";
            case 4->"EUR-PEN";
            case 5->"PEN-CLP";
            case 6-> "CLP-PEN";
            case 7-> "PEN-COP";
            case 8-> "COP-PEN";
            case 9-> "PEN-VES_PA";
            case 10-> "VES_PA-PEN";
            default -> "";
        };

        // Obtener la tasa desde ActualizadorTasas y verificar si se obtiene correctamente
        double tasa = actualizadorTasas.obtenerTasa(parMonedas);
        if (tasa == 1.0){
            System.out.println("Advertencia: no se encontró una tasa válida para " + parMonedas);
        }
        return tasa;
    }

}

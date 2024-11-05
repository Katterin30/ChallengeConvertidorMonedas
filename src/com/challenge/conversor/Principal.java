package com.challenge.conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        conversor.actualizarTasas(); // Actualizar tasa al inicio del programa.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos al Conversor de Monedas");
        double cantidad = 0;
        int monedaOrigen = 0;
        int monedaDestino = 0;
        String continuar = "n";


        String menu = """
                **************************************************************
                Monedas disponibles para realizar la conversion:
                1- PEN
                2- USD
                3- EUR
                4- CLP
                5- COP
                6- VES_PA
                **************************************************************
                """;

        do {
            System.out.println(menu);
            System.out.print("Seleccione moneda de origen: ");
            monedaOrigen = scanner.nextInt();
            System.out.print("Seleccione moneda de Destino: ");
            monedaDestino = scanner.nextInt();

            if (monedaOrigen >= 1 && monedaDestino <= 10) {
                System.out.println("Ingrese el monto que desea convertir: ");
                cantidad = scanner.nextDouble();
                double tasaDeCambio = conversor.obtenerTasa(monedaOrigen, monedaDestino);
                System.out.println("La tasa de cambio es: " + tasaDeCambio);

                if (tasaDeCambio != 1.0) {
                    double resultado = conversor.convertir(cantidad, tasaDeCambio);
                    System.out.println("El Resultado consultado es: " + String.format("%.2f", resultado));
                } else {
                    System.out.println("Advertencia: no se encontró una tasa válida. Intente de nuevo.");
                }

            } else {
                System.out.println("Esta opcion no es valida. Intente de nuevo");
            }

            System.out.print("Desea realizar otra operacion? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equals("s"));
        System.out.println("Usted esta saliendo del conversor. " +
                "Gracias por hacer uso del conversor!");
        scanner.close();
    }
}


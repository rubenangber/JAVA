package com.paquete;

public class App {
    public static void main(String[] args) {
        String nombre = "Ruben";
        int edad = 21;
        float altura = 1.72f;
        boolean casado = false;
        double telefono = 666555444d;
        long numeroFav = 10000000000L;

        System.out.printf("Nombre >> %s\n", nombre);
        System.out.printf("Edad >> %d\n", edad);
        System.out.printf("Altura >> %s\n", altura);
        System.out.printf("Esta casado? >> %b\n", casado);
        System.out.printf("Telefono >> %.0f\n", telefono);
        System.out.printf("Numero favorito >>> %d\n", numeroFav);
    }
}

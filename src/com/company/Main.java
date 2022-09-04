package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        comparador(1);
        comparador(0);
        comparador(-1);
        bucleWhile();
        bucleDoWhile();
        bucleFor();
        switchEstacion("Primavera");
        switchEstacion("Verano");
        switchEstacion("Otoño");
        switchEstacion("Invierno");
        switchEstacion("Soleado");
    }

    static void comparador(int numeroIf) {
        if (numeroIf == 0) {
            System.out.println("Es cero");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es positivo");
        }
    }

    public static void bucleWhile() {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);
        }
    }

    public static void bucleDoWhile() {
        int numeroDoWhile = 0;
        do {
            System.out.println("numeroDoWhile: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile == 0);
    }

    public static void bucleFor() {

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor: "+numeroFor);
        }
    }

    public static void switchEstacion(String estacion) {
        switch (estacion) {
            case "Primavera" -> System.out.println("Estas en la estación Primavera");
            case "Verano" -> System.out.println("Estas en la estación Verano");
            case "Otoño" -> System.out.println("Estas en la estación Otoño");
            case "Invierno" -> System.out.println("Estas en la estación Invierno");
            default -> System.out.println("No es una estación válida");
        }
    }
}

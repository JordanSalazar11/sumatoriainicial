package com.example.recuperacionejercicio1;

//Escalera.java
public class HelloApplication {

    public static void Escalera(int escalones) {
        if (escalones == 0) {
            System.out.println("__");
        } else if (escalones > 0) {
            // Escalera ascendente
            for (int i = 0; i < escalones; i++) {
                for (int j = 0; j < escalones - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        } else {
            // Escalera descendente
            escalones = Math.abs(escalones);
            for (int i = 0; i < escalones; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("_|");
            }
        }
    }

    public static void main(String[] args) {
        // Ejemplos
        Escalera(4);
        System.out.println();
        Escalera(-4);
        System.out.println();
        Escalera(0);
    }
}
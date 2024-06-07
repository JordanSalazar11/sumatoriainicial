package com.example.recuperacionejercicio3;

import java.util.List;

public class HelloApplication {

    public static String calcularGanador(List<String[]> jugadas) {
        int contadorJugador1 = 0;
        int contadorJugador2 = 0;

        for (String[] jugada : jugadas) {
            String jugadaJugador1 = jugada[0];
            String jugadaJugador2 = jugada[1];

            if (gana(jugadaJugador1, jugadaJugador2)) {
                contadorJugador1++;
            } else if (gana(jugadaJugador2, jugadaJugador1)) {
                contadorJugador2++;
            }
        }

        if (contadorJugador1 > contadorJugador2) {
            return "Player 1";
        } else if (contadorJugador2 > contadorJugador1) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }

    private static boolean gana(String jugada1, String jugada2) {
        return (jugada1.equals("S") && jugada2.equals("P")) ||
                (jugada1.equals("R") && jugada2.equals("S")) ||
                (jugada1.equals("P") && jugada2.equals("R"));
    }

    public static void main(String[] args) {
        List<String[]> jugadas = List.of(
                new String[]{"S", "P"},
                new String[]{"R", "S"},
                new String[]{"P", "R"}
        );

        String resultado = calcularGanador(jugadas);
        System.out.println(resultado);
    }
}
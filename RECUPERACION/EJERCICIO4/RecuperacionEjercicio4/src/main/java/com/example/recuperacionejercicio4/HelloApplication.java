package com.example.recuperacionejercicio4;

public class HelloApplication {

    public static int[] calcularPosicionFinal(int[] pasos) {
        int x = 0;
        int y = 0;
        int direccion = 0; // 0 = eje Y positivo, 1 = eje X negativo, 2 = eje Y negativo, 3 = eje X positivo

        for (int paso : pasos) {
            switch (direccion) {
                case 0:
                    y += paso;
                    break;
                case 1:
                    x -= paso;
                    break;
                case 2:
                    y -= paso;
                    break;
                case 3:
                    x += paso;
                    break;
            }
            // Cambiar de dirección en sentido contrario a las agujas del reloj
            direccion = (direccion + 1) % 5;
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        int[] pasos = {10, 5, -2};
        int[] posicionFinal = calcularPosicionFinal(pasos);
        System.out.println("Posición final: (x: " + posicionFinal[0] + ", y: " + posicionFinal[1] + ")");
        // Output: Posición final: (x: -5, y: 12)
    }
}
package com.java.basics;

public class LoopsDemo {
    public static void main(String[] args) {
        // 1. Bucle for: Ejecuta un bloque de código un número específico de veces
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración for: " + i); // 0, 1, 2, 3, 4
        }

        // 2. Bucle while: Ejecuta mientras la condición sea verdadera
        int j = 0;
        while (j < 3) {
            System.out.println("Iteración while: " + j); // 0, 1, 2
            j++;
        }

        // 3. Bucle do-while: Ejecuta al menos una vez, luego verifica la condición
        int k = 0;
        do {
            System.out.println("Iteración do-while: " + k); // 0, 1
            k++;
        } while (k < 2);
    }
}

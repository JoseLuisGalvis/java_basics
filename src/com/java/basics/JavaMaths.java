package com.java.basics;

public class JavaMaths {
    public static void main(String[] args) {
        // Valor máximo entre dos números
        System.out.println("Máximo entre 5 y 10: " + Math.max(5, 10)); // 10
        // Valor mínimo entre dos números
        System.out.println("Mínimo entre 5 y 10: " + Math.min(5, 10)); // 5
        // Raíz cuadrada
        System.out.println("Raíz cuadrada de 81: " + Math.sqrt(81)); // 9.0
        // Valor absoluto (positivo)
        System.out.println("Valor absoluto de -4.7: " + Math.abs(-4.7)); // 4.7
        // Número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo)
        System.out.println("Número aleatorio (0 a 1): " + Math.random());
        // Número aleatorio entre 0 y 100 (entero)
        int randomInt = (int) (Math.random() * 101); // 0 a 100
        System.out.println("Número aleatorio (0 a 100): " + randomInt);
        // Redondear hacia arriba
        System.out.println("Redondear hacia arriba 5.3: " + Math.ceil(5.3)); // 6.0
        // Redondear hacia abajo
        System.out.println("Redondear hacia abajo 5.7: " + Math.floor(5.7)); // 5.0
        // Redondear al entero más cercano
        System.out.println("Redondear 5.5: " + Math.round(5.5)); // 6
        System.out.println("Redondear 5.4: " + Math.round(5.4)); // 5
        // Potencia: elevar un número a otro (2^3 = 8)
        System.out.println("2 elevado a la 3: " + Math.pow(2, 3)); // 8.0
    }
}

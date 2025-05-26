package com.java.basics;

public class DataTypes {
    public static void main(String[] args) {
        // Enteros
        int myNum = 5;                              // -2^31 a 2^31-1 (32 bits)
        byte num = 100;                             // -128 a 127 (8 bits)
        short number = 5000;                        // -32,768 a 32,767 (16 bits)
        long myLong = 15_000_000_000L;              // -2^63 a 2^63-1 (64 bits)

        // Decimales
        float myFloatNum = 5.99f;                   // 32 bits (precisión simple)
        double myDouble = 19.99d;                   // 64 bits (precisión doble)

        // Otros
        char myLetter = 'D';                        // Caracter Unicode (16 bits)
        boolean myBool = true;                      // true o false (1 bit)
        String myText = "Tipos de datos en Java";   // Cadena de caracteres

        // Impresión optimizada
        System.out.printf("Entero (int): %d%n", myNum);
        System.out.printf("Byte: %d%n", num);
        System.out.printf("Short: %d%n", number);
        System.out.printf("Long: %d%n", myLong);
        System.out.printf("Flotante: %.2f%n", myFloatNum);
        System.out.printf("Double: %.2f%n", myDouble);
        System.out.printf("Char: %c%n", myLetter);
        System.out.printf("Boolean: %b%n", myBool);
        System.out.printf("String: %s%n", myText);
    }
}



package com.java.basics;

public class MethodsBasic {
    // 1. Método simple (sin parámetros)
    static void saludar() {
        System.out.println("¡Hola desde el método saludar()!");
    }

    // 2. Método con un parámetro
    static void saludarUsuario(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // 3. Método con múltiples parámetros
    static void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " + " + b + " = " + resultado);
    }

    public static void main(String[] args) {

        // Llamar a un método simple
        saludar(); // Imprime un saludo general

        // Llamar al mismo método varias veces
        saludar();
        saludar();

        // Llamar a un método con un parámetro
        saludarUsuario("Laura");
        saludarUsuario("Carlos");

        // Llamar a un método con múltiples parámetros
        sumar(5, 3);
        sumar(10, 20);
    }
}

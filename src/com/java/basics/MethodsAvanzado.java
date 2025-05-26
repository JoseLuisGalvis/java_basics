package com.java.basics;

public class MethodsAvanzado {
    // 1. Método que retorna un valor
    static int cuadrado(int numero) {
        return numero * numero;
    }

    // 2. Método con if...else dentro
    static void verificarEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    // 3. Sobrecarga de métodos (mismo nombre, diferentes parámetros)
    static void mostrarMensaje() {
        System.out.println("Hola, este es un mensaje sin nombre.");
    }

    static void mostrarMensaje(String nombre) {
        System.out.println("Hola, " + nombre + ", este es un mensaje personalizado.");
    }

    // 4. Método recursivo (llamarse a sí mismo)
    static int factorial(int n) {
        if (n == 0) {
            return 1; // Caso base (detención)
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }

    public static void main(String[] args) {

        // Llamada a un método con retorno de valor
        int resultado = cuadrado(6);
        System.out.println("El cuadrado de 6 es: " + resultado);

        // Llamada al método con if...else
        verificarEdad(16);
        verificarEdad(21);

        // Llamadas a los métodos sobrecargados
        mostrarMensaje(); // sin parámetros
        mostrarMensaje("Ana"); // con parámetro

        // Llamada a una función recursiva
        int numero = 5;
        int resultadoFactorial = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultadoFactorial);
    }
}

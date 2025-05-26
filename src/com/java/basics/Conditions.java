package com.java.basics;

public class Conditions {
    public static void main(String[] args) {
        // === 1. If básico ===
        System.out.println("=== Condicional Simple (if) ===");
        if (20 > 18) {
            System.out.println("20 es mayor que 18"); // Siempre se ejecuta
        }

        // === 2. If-else ===
        System.out.println("\n=== Condicional Binario (if-else) ===");
        int hora = 20;
        if (hora < 18) {
            System.out.println("Buen día.");
        } else {
            System.out.println("Buenas noches."); // Se ejecuta esta línea
        }

        // === 3. Else if (múltiples condiciones) ===
        System.out.println("\n=== Condicional Múltiple (else if) ===");
        int horaActual = 22;
        if (horaActual < 10) {
            System.out.println("Buenos días.");
        } else if (horaActual < 18) {
            System.out.println("Buenas tardes.");
        } else {
            System.out.println("Buenas noches."); // Salida esperada
        }

        // === 4. If con variables booleanas ===
        System.out.println("\n=== Condicional con Booleanos ===");
        boolean esFinDeSemana = true;
        if (esFinDeSemana) {
            System.out.println("¡A descansar!"); // Se ejecuta si es true
        }

        // === 5. Ejemplo práctico: Validación de edad ===
        System.out.println("\n=== Ejemplo Práctico: Validar Edad ===");
        int edadUsuario = 17;
        if (edadUsuario >= 18) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado. Menor de edad."); // Salida
        }

        // === 6. Condicionales anidados ===
        System.out.println("\n=== Condicionales Anidados ===");
        boolean tieneEntrada = true;
        int edadCliente = 16;

        if (tieneEntrada) {
            if (edadCliente >= 18) {
                System.out.println("Puede ingresar al VIP.");
            } else {
                System.out.println("Solo zona general."); // Salida
            }
        } else {
            System.out.println("Compre una entrada primero.");
        }
    }
}

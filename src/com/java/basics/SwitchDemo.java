package com.java.basics;

public class SwitchDemo {
    public static void main(String[] args) {
        // === 1. Switch Básico (Números) ===
        System.out.println("=== Switch Básico (Días de la semana) ===");
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles"); // Este se ejecutará
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido: debe ser 1-7");
        }

        // === 2. Switch con Strings (Java 7+) ===
        System.out.println("\n=== Switch con Strings ===");
        String pais = "México";

        switch (pais.toLowerCase()) { // Convertimos a minúsculas para evitar errores
            case "méxico":
                System.out.println("Idioma: Español");
                break;
            case "brasil":
                System.out.println("Idioma: Portugués");
                break;
            case "eeuu":
                System.out.println("Idioma: Inglés");
                break;
            default:
                System.out.println("Idioma desconocido");
        }

        // === 3. Switch sin break (Falling Through) ===
        System.out.println("\n=== Switch con 'Falling Through' ===");
        int mes = 2;
        System.out.print("Febrero es: ");

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 días");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 días");
                break;
            case 2:
                System.out.println("28 o 29 días"); // Salida esperada
                break;
        }

        // === 4. Switch Moderno (Java 12+) ===
        System.out.println("\n=== Switch con Flecha (->) ===");
        int puntuacion = 85;
        String resultado = switch (puntuacion / 10) {
            case 10, 9 -> "Excelente";
            case 8 -> "Muy bien";
            case 7 -> "Bien";
            case 6 -> "Aprobado";
            default -> "Reprobado";
        };
        System.out.println("Resultado: " + resultado); // Muy bien

        // === 5. Ejemplo Práctico: Calculadora ===
        System.out.println("\n=== Ejemplo Práctico: Calculadora ===");
        char operador = '+';
        int a = 5, b = 3;

        switch (operador) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b)); // 8
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Operador no válido");
        }
    }
}
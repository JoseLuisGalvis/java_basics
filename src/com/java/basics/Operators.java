package com.java.basics;

public class Operators {
    public static void main(String[] args) {

        // Operadores Aritméticos
        int num1 = 6;
        int num2 = 3;

        System.out.println("Suma: " + (num1 + num2));         // 6 + 3 = 9
        System.out.println("Resta: " + (num1 - num2));        // 6 - 3 = 3
        System.out.println("Multiplicación: " + (num1 * num2)); // 6 * 3 = 18
        System.out.println("División: " + (num1 / num2));     // 6 / 3 = 2
        System.out.println("Módulo (residuo): " + (num1 % num2)); // 6 % 3 = 0

        // Operadores de Incremento y Decremento
        num1++; // num1 ahora vale 7
        System.out.println("Incremento de num1: " + num1);

        num2--; // num2 ahora vale 2
        System.out.println("Decremento de num2: " + num2);

        // Operadores de Asignación Compuesta
        int resultado = 5;
        resultado += 3; // resultado = resultado + 3 → 8
        System.out.println("Asignación compuesta (+=): " + resultado);

        // Operadores de Comparación
        System.out.println("¿num1 es igual a num2? " + (num1 == num2)); // false, 7 ≠ 2
        System.out.println("¿num1 es mayor que num2? " + (num1 > num2)); // true
        System.out.println("¿num1 es menor o igual a num2? " + (num1 <= num2)); // false

        // Operadores Lógicos
        int edad = 20;
        boolean esMayorDeEdad = edad >= 18;
        boolean tieneLicencia = true;

        // AND lógico (&&): ambas condiciones deben ser verdaderas
        System.out.println("¿Puede conducir? " + (esMayorDeEdad && tieneLicencia)); // true

        // OR lógico (||): al menos una condición debe ser verdadera
        System.out.println("¿Tiene permiso especial o es mayor de edad? " + (edad >= 18 || tieneLicencia)); // true

        // NOT lógico (!): invierte el valor booleano
        System.out.println("¿No tiene licencia? " + (!tieneLicencia)); // false
    }
}


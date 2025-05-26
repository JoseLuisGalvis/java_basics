package com.java.basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entrada de texto
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Leer un entero
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Leer un número decimal
        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Mostrar resultados
        System.out.println("\nResumen:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");

        scanner.close();
    }
}


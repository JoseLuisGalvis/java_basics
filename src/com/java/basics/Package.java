package com.java.basics;

// 1. Importar clase específica desde un paquete estándar de Java
import java.util.Scanner;

// 2. Importar todo un paquete (menos eficiente, pero posible)
import java.util.*;

// 3. Importar una clase personalizada de otro paquete
import com.java.utils.Saludos;

public class Package {
    public static void main(String[] args) {
        // Uso del paquete estándar java.util.Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String nombre = entrada.nextLine();

        // Uso de clase personalizada desde otro paquete
        Saludos saludos = new Saludos();
        saludos.decirHola();

        System.out.println("Bienvenido/a, " + nombre + "!");
    }
}

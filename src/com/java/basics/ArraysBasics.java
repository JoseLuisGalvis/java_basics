package com.java.basics;

public class ArraysBasics {
    public static void main(String[] args) {

        // 1. Crear y acceder a un array
        String[] frutas = {"Manzana", "Banana", "Cereza", "Mango"};
        System.out.println("Primera fruta: " + frutas[0]); // Accedemos al primer elemento (índice 0)

        // 2. Cambiar un elemento del array
        frutas[1] = "Naranja"; // Cambiamos 'Banana' por 'Naranja'
        System.out.println("Fruta actualizada en el índice 1: " + frutas[1]);

        // 3. Encontrar la longitud (cantidad de elementos) de un array
        System.out.println("Cantidad de frutas: " + frutas.length);

        // 4. Recorrer un array con un bucle 'for' tradicional
        System.out.println("Listado de frutas con 'for':");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("- " + frutas[i]);
        }

        // 5. Recorrer un array con un bucle 'for-each'
        System.out.println("Listado de frutas con 'for-each':");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }
}

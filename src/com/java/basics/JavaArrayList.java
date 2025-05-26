package com.java.basics;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList de Strings
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Acceder a elementos
        System.out.println("Primera fruta: " + frutas.get(0));

        // Eliminar un elemento
        frutas.remove("Banana");

        // Tamaño de la lista
        System.out.println("Tamaño actual: " + frutas.size());

        // Recorrer con for tradicional
        System.out.println("Recorriendo con for:");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("- " + frutas.get(i));
        }

        // Recorrer con for-each
        System.out.println("Recorriendo con for-each:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // Eliminar todos los elementos
        frutas.clear();
        System.out.println("¿Está vacía la lista? " + frutas.isEmpty());

        // ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Números:");
        for (int num : numeros) {
            System.out.println("- " + num);
        }
    }
}

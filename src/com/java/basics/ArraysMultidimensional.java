package com.java.basics;

public class ArraysMultidimensional {
    public static void main(String[] args) {

        // 1. Crear un array bidimensional (matriz de enteros)
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 2. Acceder a un elemento específico
        System.out.println("Elemento en la fila 0, columna 1: " + matriz[0][1]); // Imprime 2

        // 3. Cambiar el valor de un elemento
        matriz[1][2] = 99;
        System.out.println("Nuevo valor en [1][2]: " + matriz[1][2]); // Imprime 99

        // 4. Recorrer el array multidimensional con bucles anidados
        System.out.println("Recorriendo la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }

        // 5. Otra forma: recorrido con for-each anidado
        System.out.println("Recorriendo con for-each:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}


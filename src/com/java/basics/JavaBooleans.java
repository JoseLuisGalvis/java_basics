package com.java.basics;

public class JavaBooleans {
    public static void main(String[] args) {
        // Booleanos directos: true o false
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("¿Java es divertido?: " + isJavaFun);         // true
        System.out.println("¿El pescado es sabroso?: " + isFishTasty);   // false

        // Booleanos con expresiones de comparación
        int x = 10;
        int y = 9;

        System.out.println("¿x es mayor que y?: " + (x > y));            // true
        System.out.println("¿x es menor que y?: " + (x < y));            // false
        System.out.println("¿x es igual a y?: " + (x == y));             // false
        System.out.println("¿x es diferente de y?: " + (x != y));        // true
        System.out.println("¿x es mayor o igual que y?: " + (x >= y));   // true
        System.out.println("¿x es menor o igual que y?: " + (x <= y));   // false

        // Evaluación de condiciones con operadores lógicos
        boolean tieneLicencia = true;
        int edad = 17;

        // AND lógico: ambas condiciones deben ser verdaderas
        boolean puedeConducir = (edad >= 18) && tieneLicencia;
        System.out.println("¿Puede conducir?: " + puedeConducir);        // false

        // OR lógico: al menos una condición debe ser verdadera
        boolean puedeEntrar = (edad >= 18) || tieneLicencia;
        System.out.println("¿Puede entrar al evento?: " + puedeEntrar);  // true

        // NOT lógico: invierte el valor booleano
        System.out.println("¿No tiene licencia?: " + !tieneLicencia);    // false

        // Booleanos en una condición if
        if (isJavaFun) {
            System.out.println("¡Me gusta programar en Java!");
        } else {
            System.out.println("Prefiero otro lenguaje.");
        }

        // Booleanos derivados de métodos
        String texto = "Hola Mundo";
        boolean contieneHola = texto.contains("Hola"); // true
        System.out.println("¿El texto contiene 'Hola'?: " + contieneHola);

        // Comparación booleana en variables tipo String
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println("¿a == b?: " + (a == b));         // true (apuntan al mismo objeto internamente)
        System.out.println("¿a == c?: " + (a == c));         // false (diferentes objetos)
        System.out.println("¿a.equals(c)?: " + a.equals(c)); // true (mismo contenido)

    }
}


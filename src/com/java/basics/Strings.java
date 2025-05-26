package com.java.basics;

public class Strings {
    public static void main(String[] args) {

        // 🧵 1. CREACIÓN DE STRINGS
        String saludo = "Hola, soy una cadena de texto (String)";
        System.out.println(saludo);

        // 🗨️ 2. COMILLAS DENTRO DE UN STRING (quotes inside a string)
        String fraseConComillas = "El profesor dijo: \"Estudien para el examen\".";
        System.out.println(fraseConComillas);

        // 🔠 3. MÉTODOS DE LA CLASE STRING

        // length(): obtiene la longitud (número de caracteres)
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Longitud del alfabeto: " + alfabeto.length()); // 26

        // toUpperCase(): convierte el texto a MAYÚSCULAS
        String texto = "Java es divertido";
        System.out.println("Mayúsculas: " + texto.toUpperCase());

        // toLowerCase(): convierte el texto a minúsculas
        System.out.println("Minúsculas: " + texto.toLowerCase());

        // indexOf(): devuelve la posición de una palabra dentro del texto
        String frase = "Encuentra la palabra String en esta frase.";
        System.out.println("Posición de 'String': " + frase.indexOf("String")); // 21

        // 🔗 4. CONCATENACIÓN DE STRINGS

        // Usando el operador +
        String parte1 = "Estoy concatenando";
        String parte2 = "dos cadenas";
        String resultado = parte1 + " " + parte2;
        System.out.println("Concatenación: " + resultado);

        // 🔢 5. CONCATENAR STRING CON UN NÚMERO
        String numeroTexto = "10";
        int numero = 20;
        String combinado = numeroTexto + numero; // "10" + 20 = "1020"
        System.out.println("String + int = " + combinado);

        // 📋 6. OTROS CARACTERES ESPECIALES (ESCAPE SEQUENCES)
        String multilinea = "Primera línea\nSegunda línea";
        System.out.println("Texto con salto de línea:\n" + multilinea);

        String tabulado = "Nombre:\tJuan";
        System.out.println("Texto con tabulación:\n" + tabulado);
    }
}


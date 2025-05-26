package com.java.basics;

// 1. Definimos una clase llamada "Persona"
class Persona {
    // Atributos (variables de instancia)
    String nombre = "Desconocido";
    int edad = 0;

    // Método de la clase
    void saludar() {
        System.out.println("¡Hola! Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

public class ClasesObjetos1 {
    public static void main(String[] args) {

        // 2. Crear un objeto de la clase Persona
        Persona persona1 = new Persona();

        // Acceder a los atributos del objeto
        System.out.println("Nombre: " + persona1.nombre); // "Desconocido"
        System.out.println("Edad: " + persona1.edad);     // 0

        // Modificar atributos del objeto
        persona1.nombre = "Carlos";
        persona1.edad = 30;

        // Volver a mostrar los atributos modificados
        System.out.println("Nombre modificado: " + persona1.nombre); // "Carlos"
        System.out.println("Edad modificada: " + persona1.edad);     // 30

        // Llamar al método del objeto
        persona1.saludar();

        // 3. Crear múltiples objetos con valores distintos
        Persona persona2 = new Persona();
        persona2.nombre = "Ana";
        persona2.edad = 25;
        persona2.saludar(); // "Hola! Mi nombre es Ana y tengo 25 años."

        Persona persona3 = new Persona();
        persona3.nombre = "Luis";
        persona3.edad = 40;
        persona3.saludar(); // "Hola! Mi nombre es Luis y tengo 40 años."
    }
}
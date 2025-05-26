package com.java.basics;

public class Modifiers {
    // Atributo público: accesible desde cualquier clase
    public String nombre = "Juan";
    // Atributo predeterminado (package-private): accesible solo dentro del mismo paquete
    String ciudad = "Bogotá";
    // Atributo protegido: accesible dentro del mismo paquete y por subclases
    protected int edad = 30;

    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        System.out.println("Nombre (public): " + obj.nombre);
        System.out.println("Ciudad (default): " + obj.ciudad);
        System.out.println("Edad (protected): " + obj.edad);

        // Acceder a la clase final
        FinalClass finalObj = new FinalClass();
        finalObj.saludar();

        // Usar una clase abstracta mediante una subclase concreta
        Animal perro = new Perro();
        perro.hacerSonido();
    }
}

// Clase predeterminada (sin modificador): accesible solo dentro del mismo paquete
class ClaseDefault {
    void mostrarMensaje() {
        System.out.println("Soy una clase predeterminada (default).");
    }
}

// Clase final: no puede ser extendida (heredada)
final class FinalClass {
    void saludar() {
        System.out.println("Hola desde una clase final.");
    }
}

// Clase abstracta: no se puede instanciar directamente
abstract class Animal {
    // Método abstracto: debe implementarse en las subclases
    public abstract void hacerSonido();
}

// Subclase concreta que extiende de una clase abstracta
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro dice: ¡Guau!");
    }
}

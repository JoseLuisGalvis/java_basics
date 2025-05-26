package com.java.basics;

// Abstracción: Clase abstracta que define la estructura general
// de un medio de transporte
abstract class MedioTransporte {
    // Encapsulamiento: Atributos privados con acceso controlado
    private String marca;
    private int velocidadMaxima;

    // Constructor
    public MedioTransporte(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Encapsulamiento: Getters para acceder a los atributos
    public String getMarca() {
        return marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Abstracción: Método abstracto que las subclases deben implementar
    public abstract void mover();

    // Herencia: Método común que todas las subclases heredan
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}

// Subclase Avion
class Avion extends MedioTransporte {
    public Avion(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima); // Herencia: Llama al constructor de la clase base
    }

    // Polimorfismo: Sobrescribe el método mover
    @Override
    public void mover() {
        System.out.println("El avión " + getMarca() + " vuela por el cielo.");
    }
}

// Subclase Barco
class Barco extends MedioTransporte {
    public Barco(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
    }

    @Override
    public void mover() {
        System.out.println("El barco " + getMarca() + " navega por el agua.");
    }
}

// Subclase Carro
class Carro extends MedioTransporte {
    public Carro(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
    }

    @Override
    public void mover() {
        System.out.println("El carro " + getMarca() + " circula por la carretera.");
    }
}

// Subclase Subterraneo
class Subterraneo extends MedioTransporte {
    public Subterraneo(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
    }

    @Override
    public void mover() {
        System.out.println("El subterráneo " + getMarca() + " viaja bajo tierra.");
    }
}

public class PrincipiosPOO {
    public static void main(String[] args) {
        // Crear un arreglo de Medios de Transporte (Polimorfismo)
        MedioTransporte[] transportes = {
                new Avion("Boeing", 900),
                new Barco("Yamaha", 50),
                new Carro("Toyota", 200),
                new Subterraneo("Siemens", 80)
        };

        // Iterar sobre los transportes (Polimorfismo y Herencia)
        System.out.println("Demostración de los principios de POO:");
        for (MedioTransporte transporte : transportes) {
            transporte.mostrarInformacion(); // Herencia: Método heredado
            transporte.mover();             // Polimorfismo: Método sobrescrito
            System.out.println();           // Línea en blanco para claridad
        }
    }
}

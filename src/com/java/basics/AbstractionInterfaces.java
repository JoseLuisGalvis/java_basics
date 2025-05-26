package com.java.basics;

// 1. Clase abstracta con métodos abstractos y concretos
abstract class Vehiculo {
    public abstract void encenderMotor();

    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }
}

// 2. Interfaz simple
interface Transportable {
    void cargar();
}

// Otra interfaz
interface Mantenible {
    void realizarMantenimiento();
}

// 3. Clase concreta que hereda de clase abstracta e implementa múltiples interfaces
class Camion extends Vehiculo implements Transportable, Mantenible {

    @Override
    public void encenderMotor() {
        System.out.println("El camión enciende su motor diésel.");
    }

    @Override
    public void cargar() {
        System.out.println("El camión está siendo cargado con mercancía.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("El camión está en mantenimiento preventivo.");
    }
}

public class AbstractionInterfaces {
    public static void main(String[] args) {
        Camion miCamion = new Camion();

        // Métodos heredados de la clase abstracta
        miCamion.encenderMotor();
        miCamion.detener();

        // Métodos de las interfaces
        miCamion.cargar();
        miCamion.realizarMantenimiento();
    }
}


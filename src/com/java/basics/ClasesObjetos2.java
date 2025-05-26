package com.java.basics;

// Clase con atributos múltiples y constructores
class Coche {
    String marca;
    String modelo;
    int anio;
    String placa;
    String color;
    String transmision;

    // Constructor por defecto
    public Coche() {
        marca = "Chevrolet";
        modelo = "Optra";
        anio = 2010;
        placa = "AA150CB";
        color = "Azul";
        transmision = "Sincrónica";
    }

    // Constructor con parámetros (completo)
    public Coche(String marca, String modelo, int anio, String placa, String color, String transmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
        this.color = color;
        this.transmision = transmision;
    }

    // Método para mostrar la información del coche (corregido "año" -> "anio")
    void mostrarInfo() {
        System.out.println("Marca: " + marca +
                ", Modelo: " + modelo +
                ", Año: " + anio +
                ", Placa: " + placa +
                ", Color: " + color +
                ", Transmisión: " + transmision);
    }

    // Método con parámetros (corregido "año" -> "anio")
    void actualizarAnio(int nuevoAnio) {
        if (nuevoAnio > anio) {
            anio = nuevoAnio;
            System.out.println("Año actualizado a " + anio);
        } else {
            System.out.println("El año proporcionado no es más reciente.");
        }
    }
}

public class ClasesObjetos2 {
    public static void main(String[] args) {
        // Usando constructor por defecto
        Coche coche1 = new Coche();
        coche1.mostrarInfo();

        // Usando constructor completo (ahora obligatorio)
        Coche coche2 = new Coche("Toyota", "Corolla", 2018, "JA2024VA", "Verde", "Manual");
        coche2.mostrarInfo();
    }
}


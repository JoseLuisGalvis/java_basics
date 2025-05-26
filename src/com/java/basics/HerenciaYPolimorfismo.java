package com.java.basics;

// Clase base
class Electrodomestico {
    protected String nombre;

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
    }

    // Método heredado que no se sobrescribe (HERENCIA)
    public void mostrarMarca() {
        System.out.println("Marca del electrodoméstico: " + nombre);
    }

    // Método que se sobrescribirá (POLIMORFISMO)
    public void funcionPrincipal() {
        System.out.println(nombre + " realiza su función principal.");
    }
}

// Subclase Televisor
class Televisor extends Electrodomestico {
    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionPrincipal() {
        System.out.println(nombre + " está mostrando canales de TV.");
    }
}

// Subclase Refrigerador
class Refrigerador extends Electrodomestico {
    public Refrigerador(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionPrincipal() {
        System.out.println(nombre + " está conservando alimentos.");
    }
}

public class HerenciaYPolimorfismo {
    public static void main(String[] args) {
        // Instancias individuales
        Televisor tv = new Televisor("Samsung");
        Refrigerador refri = new Refrigerador("LG");

        // HERENCIA: método que no se sobreescribe
        tv.mostrarMarca();
        refri.mostrarMarca();

        // POLIMORFISMO: método sobrescrito según el tipo real del objeto
        tv.funcionPrincipal();
        refri.funcionPrincipal();

        // Arreglo polimórfico
        Electrodomestico[] electrodomesticos = {
                new Televisor("Sony"),
                new Refrigerador("Whirlpool")
        };

        System.out.println("\nProbando polimorfismo con arreglo:");
        for (Electrodomestico e : electrodomesticos) {
            e.mostrarMarca();       // Herencia
            e.funcionPrincipal();   // Polimorfismo
        }
    }
}



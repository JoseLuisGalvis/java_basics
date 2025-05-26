package com.java.basics;

public class Encapsulation {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // Asignar valores usando setters
        cuenta.setTitular("Ana María");
        cuenta.setSaldo(1500.75);

        // Obtener valores usando getters
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: $" + cuenta.getSaldo());

        // Intentar asignar un saldo negativo
        cuenta.setSaldo(-200); // No se actualizará
        System.out.println("Saldo después de intento inválido: $" + cuenta.getSaldo());
    }
}

class CuentaBancaria {
    // Atributos privados: protegidos contra acceso directo
    private String titular;
    private double saldo;

    // Getter para el titular
    public String getTitular() {
        return titular;
    }

    // Setter para el titular
    public void setTitular(String nuevoTitular) {
        this.titular = nuevoTitular;
    }

    // Getter para el saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para el saldo con validación
    public void setSaldo(double nuevoSaldo) {
        if (nuevoSaldo >= 0) {
            this.saldo = nuevoSaldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
}
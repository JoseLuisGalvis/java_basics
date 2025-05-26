package com.java.basics;

public class Externa {
    private String mensaje = "Hola desde la clase externa";

    // Clase interna (Non-static)
    class Interna {
        public void mostrarMensaje() {
            // Puede acceder a miembros privados de la clase externa
            System.out.println("Mensaje: " + mensaje);
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();

        // Para crear una instancia de la clase interna, necesitas una instancia de la externa
        Externa.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}


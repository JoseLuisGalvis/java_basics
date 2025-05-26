package com.java.basics;

public class InnerClasses {

    // 1. Clase interna común (no estática)
    class Interna {
        void mostrarMensaje() {
            System.out.println("Soy una clase interna común.");
        }
    }

    // 2. Clase interna privada
    private class InternaPrivada {
        void mostrarPrivado() {
            System.out.println("Soy una clase interna privada. Solo accesible dentro de la clase externa.");
        }
    }

    // 3. Clase interna estática
    static class InternaEstatica {
        static void mostrarEstatica() {
            System.out.println("Soy una clase interna estática.");
        }

        void mensajeNoEstatico() {
            System.out.println("Método no estático de clase interna estática.");
        }
    }

    // Método que usa la clase interna privada (solo accesible aquí)
    public void usarInternaPrivada() {
        InternaPrivada ip = new InternaPrivada();
        ip.mostrarPrivado();
    }

    public static void main(String[] args) {
        InnerClasses exterior = new InnerClasses();

        // Usando clase interna común
        InnerClasses.Interna interna = exterior.new Interna();
        interna.mostrarMensaje();

        // Usando clase interna privada (solo desde dentro de la clase externa)
        exterior.usarInternaPrivada();

        // Usando clase interna estática
       InnerClasses.InternaEstatica.mostrarEstatica();

        InnerClasses.InternaEstatica objEstatico = new InnerClasses.InternaEstatica();
        objEstatico.mensajeNoEstatico();
    }
}

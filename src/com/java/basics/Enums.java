package com.java.basics;

// 1. Enum con constantes
enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

// 2. Enum dentro de clase
class TamanioRopa {
    enum Talla {
        PEQUENO, MEDIANO, GRANDE, EXTRA_GRANDE
    }
}

public class Enums {
    public static void main(String[] args) {

        // 3. Uso de enum en switch
        DiaSemana dia = DiaSemana.MIERCOLES;

        switch (dia) {
            case LUNES:
                System.out.println("Inicio de semana.");
                break;
            case MIERCOLES:
                System.out.println("Mitad de semana.");
                break;
            case VIERNES:
                System.out.println("Casi fin de semana.");
                break;
            default:
                System.out.println("Es otro día.");
        }

        // 4. Recorrer enum con bucle
        System.out.println("\nDías de la semana:");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println("- " + d);
        }

        // Acceder a enum dentro de clase
        TamanioRopa.Talla talla = TamanioRopa.Talla.MEDIANO;
        System.out.println("\nTalla seleccionada: " + talla);
    }
}

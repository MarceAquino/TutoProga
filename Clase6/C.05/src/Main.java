import java.sql.SQLOutput;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String AZUL = "\u001B[34m";

    private static void imprimirConColor(String color, String texto) {
        if ("Azul".equals(color)) {
            System.out.println(AZUL + texto + RESET);
        } else if ("Rojo".equals(color)) {
            System.out.println(ROJO + texto + RESET);
        } else {
            System.out.println(texto);
        }
    }

    public static void main(String[] args) {

        Boligrafo boliAzul = new Boligrafo((short) 100, "Azul");
        Boligrafo boliRojo = new Boligrafo((short) 50, "Rojo");

        System.out.println("=== ESTADO INICIAL BOLÍGRAFO AZUL ===");
        System.out.println("Color: " + boliAzul.getColor());
        System.out.println("Tinta inicial: " + boliAzul.getTinta());

        System.out.println("\nPintando 40 unidades...");
        String trazoAzul = boliAzul.pintar((short) 40);
        imprimirConColor(boliAzul.getColor(), trazoAzul);
        System.out.println("Tinta restante: " + boliAzul.getTinta());

        System.out.println("\nRecargando bolígrafo azul...");
        boliAzul.recargar();
        System.out.println("Tinta tras recargar: " + boliAzul.getTinta());

        System.out.println("\n====================================");
        System.out.println("=== ESTADO INICIAL BOLÍGRAFO ROJO ===");
        System.out.println("Color: " + boliRojo.getColor());
        System.out.println("Tinta inicial: " + boliRojo.getTinta());

        System.out.println("\nIntentando pintar 70 unidades (solo tiene 50)...");
        String trazoRojo = boliRojo.pintar((short) 70);
        imprimirConColor(boliRojo.getColor(), trazoRojo);
        System.out.println("Cantidad de asteriscos impresos: " + trazoRojo.length());
        System.out.println("Tinta restante: " + boliRojo.getTinta());

        System.out.println("\nIntentando pintar 10 unidades estando en 0...");
        String trazoVacio = boliRojo.pintar((short) 10);
        if (trazoVacio.isEmpty()) {
            System.out.println("[Aviso]: No se pudo pintar, el bolígrafo no tiene tinta.");
        } else {
            imprimirConColor(boliRojo.getColor(), trazoVacio);
        }

        System.out.println("\nRecargando bolígrafo rojo...");
        boliRojo.recargar();
        System.out.println("Tinta tras recarga completa: " + boliRojo.getTinta());

        System.out.println("\nPintando 10 unidades tras la recarga...");
        String nuevoTrazoRojo = boliRojo.pintar((short) 10);
        imprimirConColor(boliRojo.getColor(), nuevoTrazoRojo);
        System.out.println("Tinta final: " + boliRojo.getTinta());
        imprimirConColor("Rojo","Clases de tutoría, boludeando con colores");
    }

}
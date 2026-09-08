import models.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== Ejercicio N1 ===");
        Rectangulo rec1 = new Rectangulo(5, 4);
        System.out.println(rec1);


        System.out.println("\n=== Ejercicio N2 ===");
        Circulo cir1 = new Circulo(5);
        System.out.println(cir1);
        cir1.escalar(100);
        System.out.println("Post escalado: " + cir1);
        cir1.escalar(-50);
        System.out.println("Post escalado: " + cir1);

        System.out.println("\n=== Ejercicio N3 ===");
        Persona per1 = new Persona("Marcelo", LocalDate.of(1992, 12, 13), 1.60);
        System.out.println(per1);
        System.out.printf("El IMC con 70 kg es: %.2f%n", per1.calcularImc(70));

        System.out.println("\n=== Ejercicio N4 ===");
        Auto aut1 = new Auto("Toyota","Etios", 155.60,10.5);
        System.out.println(aut1);
        aut1.recargar(20);
        System.out.println(aut1);

        System.out.println("\n=== Ejercicio N5 ===");
        CuentaBancaria cta1 = new CuentaBancaria("Marcelo", 50000.0);
        CuentaBancaria cta2 = new CuentaBancaria("Laura", 12000.0);

        System.out.println(cta1);
        System.out.println(cta2);


        System.out.println("--- Operaciones en Cuenta " + cta1.getNumeroCuenta() + " ---");
        cta1.depositar(25000.0);
        System.out.println("Post depósito de $25000: " + cta1);
        try {
            System.out.println("Intentando retirar $15000...");
            cta1.retirar(150000.0);
            cta2.retirar(6000);
        } catch (IllegalStateException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
        System.out.println("CUENTA NUMERO 2: " + cta2.getSaldo());
        System.out.println("Post retiro de $15000: " + cta1);
        System.out.println("Saldo actual consultado: $" + cta1.getSaldo());


        try {
            System.out.println("Intentando retirar $100000...");
            cta1.retirar(100000.0);
        } catch (IllegalStateException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== Ejercicio N6 ===");
        Libro libro = new Libro("Clean Code", "Robert C. Martin", 464, 463);
        System.out.println(libro);

        libro.avanzarPagina();
        libro.retrocederPagina();
        libro.avanzarPagina();
        System.out.println("Avanzó 1 página: " + libro);
        System.out.println("¿Terminó el libro?: " + libro.haTerminado());

        try {
            libro.avanzarPagina();
        } catch (IllegalStateException e) {
            System.out.println("Control de límite: " + e.getMessage());
        }

        System.out.println("\n=== Ejercicio N7 ===");
        Termometro term = new Termometro(25.0, true);
        System.out.println(term);
        System.out.println("Bajar temperatura");
        term.ajustarTemperatura(-10);
        System.out.println(term);
        try {
            term.transformarACelsius();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        term.transformarAFahrenheit();
        System.out.println("Trasformar unidad");
        System.out.println(term);
        term.transformarACelsius();
        System.out.println("Trasformar unidad");
        System.out.println(term);

        System.out.println("\n=== Ejercicio N8: Producto ===");
        Producto prod = new Producto("Yerba Mate 1kg", 3500.0, 15);
        System.out.println("Producto inicial: " + prod);

        prod.aplicarDescuento(15);
        System.out.println("Post 15% descuento: " + prod);

        prod.realizarVenta(5);
        System.out.println("Post venta de 5 unidades: " + prod);

        try {
            System.out.println("Intentando vender 20 unidades...");
            prod.realizarVenta(20);
        } catch (IllegalStateException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        try {
            System.out.println("Intentando aplicar 120% de descuento...");
            prod.aplicarDescuento(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }

        System.out.println("\n=== Ejercicio N9: Pelota ===");
        Pelota pelota1 = new Pelota("Adidas", 68.0);
        Pelota pelota2 = new Pelota("Nike", 65.0);

        System.out.println("Pelota 1: " + pelota1);
        System.out.println("Pelota 2: " + pelota2);

        System.out.println("¿Tienen la misma circunferencia?: " + pelota1.compararCircunferencia(pelota2));

        pelota2.inflar(3.0);
        System.out.println("Post inflar Pelota 2: " + pelota2);
        System.out.println("¿Tienen la misma circunferencia ahora?: " + pelota1.compararCircunferencia(pelota2));

        System.out.println("\n=== Ejercicio N10: Reloj ===");
        Reloj reloj = new Reloj(23, 59, 58);
        System.out.println("Hora inicial: " + reloj);
        reloj.avanzarUnSegundo();
        System.out.println("+1 seg: " + reloj);
        reloj.avanzarUnSegundo();
        System.out.println("+1 seg (cambio de día): " + reloj);

        reloj.setHora(15);
        reloj.setMinuto(30);
        reloj.setSegundo(0);
        System.out.println("Hora reajustada: " + reloj);
    }


}

package model;

import interfaces.Conducible;
import interfaces.Mantenible;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo implements Mantenible, Conducible {

    private final String patente;
    private final int capacidadTanque;
    private double kilometraje;
    private static int contadorVehiculos;
    private static double precioNafta;
    private static final String PAIS_FABRICANTE = "ARGENTINA";
    private boolean encendido = false;

    public Vehiculo(String patente, int capacidadTanque) {

        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("patente invalida");
        }

        if (capacidadTanque <=0) {
            throw new IllegalArgumentException("Litros invalidos");
        }

        this.patente = patente;
        this.capacidadTanque = capacidadTanque;
        contadorVehiculos++;
    }

    public String getPatente() {
        return patente;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void avanzar(int km){
        if (!encendido) {
            System.out.println("No se puede avanzar, el vehículo está apagado.");
            return;
        }
        if (km > 0) {
            this.kilometraje += km;
            System.out.println("Avanzó " + km + " km.");
        }
    }

    public static String totalVehiculos(){
        return "La cantidad de vehiculos es " + contadorVehiculos;
    }

    public static void actualizarPrecioNafta(double nuevoPrecio){
        if (nuevoPrecio <= 0) {
            throw new IllegalArgumentException("El precio tiene que ser mayor a 0");
        }
        precioNafta = nuevoPrecio;
    }

    public double costoLlenarTanque() {
        return capacidadTanque * precioNafta;
    }

    public abstract void mostrarFicha();

    public abstract double calcularConsumoEstimado();

    public void cambiarEstadoEncendido(boolean estado) {
        this.encendido = estado;
    }

    public static class Concesionario{
        private static List<Vehiculo> flota = new ArrayList<>();

        public static void registrarVehiculo(Vehiculo v) {
            if (v != null) {
                flota.add(v);
            }
        }


        public static void mostrarFichasFlota() {
            for (Vehiculo v : flota) {
                v.mostrarFicha();
                System.out.println("-------------------");
            }
        }


        public static double calcularConsumoPromedioFlota() {
            if (flota.isEmpty()) return 0;
            double sumaConsumos = 0;
            for (Vehiculo v : flota) {
                sumaConsumos += v.calcularConsumoEstimado();
            }
            return sumaConsumos / flota.size();
        }


        public static Vehiculo obtenerVehiculoConMasKilometraje() {
            if (flota.isEmpty()) return null;
            Vehiculo mayor = flota.get(0);
            for (Vehiculo v : flota) {
                if (v.getKilometraje() > mayor.getKilometraje()) {
                    mayor = v;
                }
            }
            return mayor;
        }


        public static void listarVehiculosRequierenService() {
            System.out.println("=== VEHÍCULOS QUE REQUIEREN REVISIÓN ===");
            for (Vehiculo v : flota) {
                if (v.necesitaService((int) v.getKilometraje())) {
                    System.out.println("Patente: " + v.getPatente() + " - Estado: " + v.estadoGeneral((int) v.getKilometraje()));
                }
            }
        }
    }
}

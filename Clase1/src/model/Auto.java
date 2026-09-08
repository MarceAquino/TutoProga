package model;

public class Auto extends Vehiculo {

    private boolean puertasCerradas = false;
    private static final int KM_SERVICE_AUTO = 10000;

    public Auto(String patente, int capacidadTanque) {
        super(patente, capacidadTanque);
    }

    @Override
    public void arrancar() {
        if (!puertasCerradas) {
            System.out.println("El auto no puede arrancar: Las puertas están abiertas.");
            return;
        }
        cambiarEstadoEncendido(true);
        System.out.println("El auto encendió");
    }

    @Override
    public boolean necesitaService(int kmRecorridos) {
        return kmRecorridos >= KM_SERVICE_AUTO;
    }

    @Override
    public double calcularConsumoEstimado() {
        return 8.5; // Litros cada 100 km estimados para un auto
    }

    @Override
    public void mostrarFicha() {
        System.out.println("=== FICHA TÉCNICA AUTO ===");
        System.out.println("Patente: " + getPatente());
        System.out.println("Capacidad Tanque: " + getCapacidadTanque() + " L");
        System.out.println("Kilometraje: " + getKilometraje() + " km");
        System.out.println("Estado: " + estadoGeneral((int) getKilometraje()));
    }
}
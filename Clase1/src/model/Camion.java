package model;

public class Camion extends Vehiculo {
    private boolean cargaSegura = false;
    private static final int KM_SERVICE_CAMION = 15000;

    public Camion(String patente, int capacidadTanque) {
        super(patente, capacidadTanque);

    }

    @Override
    public void arrancar() {
        if (!cargaSegura) {
            System.out.println("El camion no puede arrancar, asegure la carga");
            return;
        }
        cambiarEstadoEncendido(true);
        System.out.println("model.Camion encendió");
    }


    @Override
    public double calcularConsumoEstimado() {
        return 14;
    }

    @Override
    public boolean necesitaService(int kmRecorridos) {
        return kmRecorridos>= KM_SERVICE_CAMION;
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

package model;

public class Moto extends Vehiculo {
    private boolean casco = false;
    private static final int KM_SERVICE_MOTO = 5000;

    public Moto(String patente, int capacidadTanque) {
        super(patente, capacidadTanque);

    }

    @Override
    public void arrancar() {
        if (!casco) {
            System.out.println("La moto no se puede arrancar, colóquese el casco");
            return;
        }
        cambiarEstadoEncendido(true);
        System.out.println("La moto encendió");
    }


    @Override
    public double calcularConsumoEstimado() {
        return 2;
    }

    @Override
    public boolean necesitaService(int kmRecorridos) {
        return kmRecorridos>= KM_SERVICE_MOTO;
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

import model.Auto;
import model.Camion;
import model.Moto;
import model.Vehiculo;


public class Main {
    public static void main(String[] args) {
        try {
            // 1. Instanciar un model.Auto, una model.Moto y un Camión
            Auto miAuto = new Auto("AA123BB", 50);
            Moto miMoto = new Moto("CC456DD", 15);
            Camion miCamion = new Camion("EE789FF", 200);

            // (Opcional para probar el arranque según sus condiciones particulares)
            // miAuto.puertasCerradas = true; // Si decides hacerlo público o agregar un setter

            // 2. Registrar los objetos en el Concesionario
            Vehiculo.Concesionario.registrarVehiculo(miAuto);
            Vehiculo.Concesionario.registrarVehiculo(miMoto);
            Vehiculo.Concesionario.registrarVehiculo(miCamion);

            // 3. Modificar el estado de los vehículos utilizando avanzar(int km)
            // Nota: Para avanzar, primero deben encenderse superando sus validaciones
            System.out.println("--- ENCENDIENDO Y MOVIendo FLOTA ---");


            // Simulamos encendido cambiando el estado o cumpliendo la condición
            miAuto.cambiarEstadoEncendido(true);
            miMoto.cambiarEstadoEncendido(true);
            miCamion.cambiarEstadoEncendido(true);

            miAuto.avanzar(12000); // Supera el service de 10.000 km
            miMoto.avanzar(2000);  // No supera el service de 5.000 km
            miCamion.avanzar(16000); // Supera el service de 15.000 km

            System.out.println();

            // 4. Mostrar la ficha completa mediante el método polimórfico del concesionario
            System.out.println("=== FICHAS DE TODA LA FLOTA ===");
            Vehiculo.Concesionario.mostrarFichasFlota();

            // 5. Actualizar el precio de la nafta y verificar el impacto en costoLlenarTanque()
            System.out.println("=== ACTUALIZACIÓN DE PRECIO DE NAFTA ===");
            System.out.println("Costo inicial llenar tanque del auto con precio base (0): $" + miAuto.costoLlenarTanque());

            Vehiculo.actualizarPrecioNafta(1200.50); // Actualizamos el precio compartido
            System.out.println("Nuevo precio de nafta aplicado ($1200.50).");
            System.out.println("Costo actualiza llenar tanque del auto: $" + miAuto.costoLlenarTanque());
            System.out.println("Costo actualizar llenar tanque del camión: $" + miCamion.costoLlenarTanque());
            System.out.println();

            // 6. Informar el consumo promedio y el vehículo con más uso
            System.out.println("=== ESTADÍSTICAS DE LA FLOTA ===");
            double consumoPromedio = Vehiculo.Concesionario.calcularConsumoPromedioFlota();
            System.out.println("Consumo promedio de la flota: " + consumoPromedio + " litros cada 100 km.");

            Vehiculo masUsado = Vehiculo.Concesionario.obtenerVehiculoConMasKilometraje();
            if (masUsado != null) {
                System.out.println("Vehículo con más uso (mayor kilometraje): Patente " + masUsado.getPatente() + " con " + masUsado.getKilometraje() + " km.");
            }
            System.out.println();

            // 7. Listar los vehículos que requieren servicio técnico
            Vehiculo.Concesionario.listarVehiculosRequierenService();

        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
    }
}
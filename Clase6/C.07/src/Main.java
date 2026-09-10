public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos libros
        Libro libro1 = new Libro("El Aleph", "Jorge Luis Borges", true);
        Libro libro2 = new Libro("Ficciones", "Jorge Luis Borges", true);

        // 2. Instanciamos lectores
        Lector lector1 = new Lector("Carlos");
        Lector lector2 = new Lector("Lucía");

        // 3. Estado inicial
        System.out.println("--- ESTADO INICIAL ---");
        libro1.mostrarInformacion();
        lector1.mostrarInformacion();

        // 4. Carlos toma prestado el libro 1
        System.out.println("\n--- OPERACIÓN: PRÉSTAMO ---");
        lector1.tomarPrestado(libro1);

        // 5. Verificamos cambios de estado
        libro1.mostrarInformacion();
        lector1.mostrarInformacion();

        // 6. Lucía intenta tomar el mismo libro (debe rebotar)
        System.out.println("\n--- OPERACIÓN: PRÉSTAMO FALLIDO ---");
        lector2.tomarPrestado(libro1);

        // 7. Carlos devuelve el libro
        System.out.println("\n--- OPERACIÓN: DEVOLUCIÓN ---");
        lector1.devolverLibro();

        // 8. Lucía lo toma ahora que está disponible
        lector2.tomarPrestado(libro1);

        // 9. Estado final
        System.out.println("\n--- ESTADO FINAL ---");
        libro1.mostrarInformacion();
        lector1.mostrarInformacion();
        lector2.mostrarInformacion();
    }
}
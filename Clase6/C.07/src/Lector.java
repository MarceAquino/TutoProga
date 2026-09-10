public class Lector {
    private String nombre;
    private Libro libroPrestado;

    public Lector(String nombre) {
        this.nombre = nombre;
        this.libroPrestado = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibroPrestado() {
        return this.libroPrestado;
    }

    public void tomarPrestado(Libro libro) {
        if (libro != null && libro.isDisponible()) {
            this.libroPrestado = libro;
            libro.prestar();
            System.out.println(this.nombre + " ha tomado prestado el libro: \"" + libro.getTitulo() + "\".");
        } else {
            System.out.println("No se pudo realizar el préstamo. El libro no está disponible.");
        }
    }

    public void devolverLibro() {
        if (this.libroPrestado != null) {
            this.libroPrestado.devolver();
            System.out.println(this.nombre + " devolvió el libro: \"" + this.libroPrestado.getTitulo() + "\".");
            this.libroPrestado = null;
        } else {
            System.out.println(this.nombre + " no tiene ningún libro para devolver.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("===== Información del Lector =====");
        System.out.println("Nombre: " + this.nombre);
        if (this.libroPrestado != null) {
            System.out.println("Libro en posesión: " + this.libroPrestado.getTitulo());
        } else {
            System.out.println("Libro en posesión: Ninguno");
        }
        System.out.println("==================================");
    }
}
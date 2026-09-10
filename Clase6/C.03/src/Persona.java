import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private final String nombre;
    private final LocalDate fechaDeNacimiento;
    private final int dni;
    private static final int MAYOR_EDAD = 18;

    public Persona(String nombre, LocalDate fechaDeNacimiento, int dni) {
        validarNombre(nombre);
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getDni() {
        return dni;
    }

    private void validarNombre(String nombre){
        if (nombre == null || nombre.isBlank() ) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni estar vacío");
        }
    }

    private int calcularEdad(){
        return Period.between(fechaDeNacimiento,LocalDate.now()).getYears();
    }

    private String esMayorDeEdad(){
        String resultado;
        if ( calcularEdad() < MAYOR_EDAD) {
            resultado = "Es Menor";
        }else{
            resultado = "Es Mayor";
        }
        return resultado;
    }

    public void mostrar(){
        System.out.println("El nombre de la persona es: " + nombre + " Su edad es: " + calcularEdad() + " "+ esMayorDeEdad() + " Su dni es: " + dni);
    }
}

import java.util.Random;

public class Estudiante {
    private String apellido;
    private String nombre;
    private String legajo;
    private int notaPrimerParcial;
    private int notaSegundoParcial;
    private static Random random;

    static {
        random = new Random();
    }

    public Estudiante(String apellido, String nombre, String legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public void setNotaPrimerParcial(int notaPrimerParcial) {
        this.notaPrimerParcial = notaPrimerParcial;
    }

    public void setNotaSegundoParcial(int notaSegundoParcial) {
        this.notaSegundoParcial = notaSegundoParcial;
    }

    private float calcularPromedio()
    {
        return (this.notaPrimerParcial + this.notaSegundoParcial) / 2.0f;
    }

    public double calcularNotaFinal()
    {
        if (this.notaPrimerParcial >= 4 && this.notaSegundoParcial >= 4)
        {

            return random.nextInt(6,11);
        }

        return -1;
    }

    public String mostrar() {
        double notaFinal = calcularNotaFinal();
        String textoFinal = (notaFinal != -1)
                ? String.valueOf((int) notaFinal)
                : "Alumno desaprobado";

        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------\n");
        sb.append("Alumno: ").append(this.apellido).append(", ").append(this.nombre).append("\n");
        sb.append("Legajo: ").append(this.legajo).append("\n");
        sb.append("1° Parcial: ").append(this.notaPrimerParcial).append(" | ");
        sb.append("2° Parcial: ").append(this.notaSegundoParcial).append("\n");
        sb.append("Promedio: ").append(String.format("%.2f", calcularPromedio())).append("\n");
        sb.append("Nota Final: ").append(textoFinal).append("\n");

        return sb.toString();
    }

}

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", LocalDate.of(1992,12,13),37186465);
        Persona p2 = new Persona("Luis", LocalDate.of(1997,12,13),37186465);
        Persona p3 = new Persona("Marcos", LocalDate.of(2020,12,13),37186465);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        }
    }

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Lucas", "Gómez", "1001");
        Estudiante e2 = new Estudiante("Carla", "Méndez", "1002");
        Estudiante e3 = new Estudiante("Martín", "Ríos", "1003");


        e1.setNotaPrimerParcial(7);
        e1.setNotaSegundoParcial(8);

        e2.setNotaPrimerParcial(4);
        e2.setNotaSegundoParcial(6);

        e3.setNotaPrimerParcial(2);
        e3.setNotaSegundoParcial(9);

        System.out.println(e1.mostrar());
        System.out.println(e2.mostrar());
        System.out.println(e3.mostrar());

    }
}
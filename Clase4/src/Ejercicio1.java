import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int suma = 0;
        int cantidad = 5 ;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            if (i == 1) {
                max = numero;
                min = numero;
            } else {
                if (numero > max) max = numero;
                if (numero < min) min = numero;
            }
            suma += numero;
        }

        double promedio = (double) suma / 5;
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + promedio);

    }
}

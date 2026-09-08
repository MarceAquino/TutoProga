import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Ingrese un número límite: ");
        int numero = scaner.nextInt();

        int contadorPrimos = 0;


        for (int i = 2; i <= numero; i++) {
            boolean esPrimo = true;
            int j = 2;

            while (j < i) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
                j++;
            }

            if (esPrimo) {
                System.out.print(i + " ");
                contadorPrimos++;
            }
        }

        System.out.println("\nTotal de primos encontrados: " + contadorPrimos);
    }
}
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextDouble();
            if (numero < 0 ){
                System.out.println("El numero tiene q ser mayor a 0");
            }
        }while(numero < 0);


        double cuadrado  = Math.pow(numero,2);
        double cubo  = Math.pow(numero,3);
        System.out.println("El cuadrado es: " + cuadrado);
        System.out.println("El cubo es: " + cubo);
    }
}
//tarea muy importante

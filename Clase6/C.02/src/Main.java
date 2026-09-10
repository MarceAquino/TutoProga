import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adivinador juego = new Adivinador();
        boolean gano = false;
        System.out.println(juego.getNumeroSecreto());
        System.out.println("===Bienvenidos al juego el Adivinador===");
        while (!gano){
            System.out.print("\nIngresá tu número: ");
            int numeroIngresado = scanner.nextInt();
            String resultado = juego.adivinar(numeroIngresado);

            if (resultado.equals("IGUAL")) {
                gano = true;
                System.out.println("\n“Ganaste!!! El número " + juego.getNumeroSecreto()
                        + " lo adivinaste en " + juego.getIntentos() + " intentos!!!”  tu nivel es: " + juego.nivelDestreza());
            } else if (resultado.equals("MAYOR")) {
                System.out.println("Pista: El número ingresado es MAYOR al número secreto.");
                System.out.println("Intentos realizados: " + juego.getIntentos());
            } else {
                System.out.println("Pista: El número ingresado es MENOR al número secreto.");
                System.out.println("Intentos realizados: " + juego.getIntentos());
            }
        }


        scanner.close();
        }
    }

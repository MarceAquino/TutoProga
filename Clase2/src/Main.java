import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se reemplaza JOptionPane por Scanner para leer desde la consola
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al Motor de Auditoria");
        System.out.print("Ingrese la contrasenia a evaluar: ");
        String inputClave = teclado.nextLine();

        Credencial miCredencial = new Credencial(inputClave);
        AuditorDeSeguridad auditor = new AuditorDeSeguridad(miCredencial);

        System.out.println("\nGenerando diagnostico...\n");
        auditor.imprimirReporte();

        teclado.close();
    }
}
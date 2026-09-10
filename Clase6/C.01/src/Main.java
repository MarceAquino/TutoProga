//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Crear la cuenta inicial
        Cuenta miCuenta = new Cuenta("Transportes Lanús S.R.L.", 15000.0);
        System.out.println("--- Estado Inicial ---");
        miCuenta.mostrar();
        System.out.println();

        // 2. Depósito válido
        System.out.println("-> Depositando $5,000.00...");
        miCuenta.ingresar(5000.0);
        miCuenta.mostrar();
        System.out.println();

        // 4. Retiro normal
        System.out.println("-> Retirando $8,000.00...");
        miCuenta.retirar(8000.0);
        miCuenta.mostrar();
        System.out.println();

        // 5. Retiro que supera el saldo (queda en descubierto / negativo)
        System.out.println("-> Retirando $18,000.00 (entra en saldo negativo)...");
        miCuenta.retirar(18000.0);
        miCuenta.mostrar();
    }
    }

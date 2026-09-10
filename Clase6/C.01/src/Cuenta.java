public class Cuenta {

    private final String titular;
    private double cantidad;


    public Cuenta(String titular, double cantidad) {
        validarTitular(titular);
        validarMonto(cantidad);
        this.titular = titular;
        this.cantidad = cantidad;

    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    private void validarTitular(String titular){
        if (titular == null || titular.isBlank() ) {
            throw new IllegalArgumentException("El titular no puede ser nulo ni estar vacío");
        }
    }

    private void validarMonto(double monto){
        if (monto <=0){
            throw new IllegalArgumentException("EL ingreso tiene que ser mayor a 0");
        }
    }

    public void ingresar(double monto){
        validarMonto(monto);
        cantidad += monto;
    }

    public void retirar(double monto){
        validarMonto(monto);
        cantidad -=monto;
    }

    public void mostrar(){
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo de la cuenta: " + cantidad);
    }


}

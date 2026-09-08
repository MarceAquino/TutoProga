package models;

import utils.ValidationUtils;

public class CuentaBancaria {

    private static int CONTADOR_CUENTAS = 1;
    private final String titular;
    private final int numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = ValidationUtils.texto(titular,"Titular");
        this.numeroCuenta = ++CONTADOR_CUENTAS;
        this.saldo = ValidationUtils.noNegativo(saldo, "Saldo");
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito){
        ValidationUtils.positivo(deposito,"Deposito");
        saldo += deposito;
    }
    public void retirar (double retiro){
        ValidationUtils.positivo(retiro,"Retiro");
        if (retiro > saldo) {
            throw new IllegalStateException("El monto de retiro es mayor al saldo");
        }
        saldo -= retiro;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

package models;

import utils.ValidationUtils;

public class Pelota {
    private final String marca;
    private double circunferencia;

    public Pelota(String marca, double circunferencia) {
        this.marca = ValidationUtils.texto(marca, "Marca");
        this.circunferencia = ValidationUtils.positivo(circunferencia, "Circunferencia");
    }

    public String getMarca() {
        return marca;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void inflar(double aumento){
        ValidationUtils.positivo(aumento, "Aumento de circunferencia");
        circunferencia += aumento;
    }

    public boolean compararCircunferencia (Pelota pelota){
        if (pelota == null) {
            return false;
        }
        return circunferencia == pelota.getCircunferencia();
    }

    @Override
    public String toString() {
        return "Pelota{" +
                "marca='" + marca + '\'' +
                ", circunferencia=" + circunferencia +
                '}';
    }
}

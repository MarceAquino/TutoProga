package models;

import utils.ValidationUtils;

public class Auto {

    private static final double CONSUMO_LITROS_KM = 0.08;

    private final String marca;
    private final String modelo;
    private double kilometraje;
    private double combustibleRestante;

    public Auto(String marca, String modelo, double kilometraje, double combustibleRestante) {
        this.marca = ValidationUtils.texto(marca, "Marca");
        this.modelo = ValidationUtils.texto(modelo, "Modelo");
        this.kilometraje = ValidationUtils.noNegativo(kilometraje, "Kilometraje");
        this.combustibleRestante = ValidationUtils.noNegativo(combustibleRestante, "Combustible");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public double getCombustibleRestante() {
        return combustibleRestante;
    }

    public double calcularAutonomia() {
        return combustibleRestante / CONSUMO_LITROS_KM;
    }

    public void recargar(double litros) {
        ValidationUtils.positivo(litros, "Litros a recargar");
        combustibleRestante += litros;
    }


    @Override
    public String toString() {
        return "models.Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", combustibleRestante=" + combustibleRestante +
                ", autonomia=" +  calcularAutonomia() + " km" +
                '}';
    }
}

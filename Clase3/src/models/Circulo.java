package models;

import utils.ValidationUtils;

public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = ValidationUtils.positivo(radio,"Radio");
    }

    public double getRadio() {
        return radio;
    }

    private static void validarPorcentaje(double porcentaje){
        if (porcentaje <= -100) {
            throw new IllegalArgumentException("Error: El porcentaje de reducción no puede ser igual o menor a -100%.");
        }

    }

    public double calcularArea(){
        return Math.PI * (radio * radio);
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
    }

    public void escalar(double porcentaje) {
        validarPorcentaje(porcentaje);
        radio *= (1.0 + (porcentaje / 100.0));
    }

    @Override
    public String toString() {
        return "models.Circulo{" +
                "radio=" + radio +
                ", area=" + calcularArea() +
                ", circunferencia=" + calcularCircunferencia() +
                '}';
    }
}

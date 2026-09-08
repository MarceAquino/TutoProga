package models;

import utils.ValidationUtils;

public class Rectangulo {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = ValidationUtils.positivo(base, "Base");
        this.altura = ValidationUtils.positivo(altura, "Altura");
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public boolean esCuadrado(){
        return  base == altura;
    }

    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*(base+altura);
    }

    @Override
    public String toString() {
        return "models.Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                ", esCuadrado=" + esCuadrado() +
                '}';
    }

}

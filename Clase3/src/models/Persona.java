package models;

import utils.ValidationUtils;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private static  final int MAYOR_EDAD = 18;
    private final String nombre;
    private LocalDate fechaDeNacimiento;
    private double altura;

    public Persona(String nombre,LocalDate fechaDeNacimiento, double altura) {
        this.nombre = ValidationUtils.texto(nombre,"Nombre");
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.altura = ValidationUtils.positivo(altura, "Altura");
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }

    public double calcularImc(double peso){
        ValidationUtils.noNegativo(peso,"Peso");
        return peso/ (altura * altura);
    }

    public boolean esMayorEdad(){
        return getEdad() >= MAYOR_EDAD;
    }

    @Override
    public String toString() {
        return "models.Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", altura=" + altura +
                ", edad=" + getEdad() +
                ", esMayorEdad=" + esMayorEdad() +
                '}';
    }
}

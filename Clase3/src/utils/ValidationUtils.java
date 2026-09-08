package utils;

public final class ValidationUtils {

    // Constructor privado para evitar instanciación accidental (new Validador())
    private ValidationUtils() {
    }

    public static String texto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El campo " + campo + " no puede estar vacío");
        }
        return valor.trim();
    }

    public static double positivo(double valor, String campo) {
        if (valor <= 0) {
            throw new IllegalArgumentException("El campo " + campo + " debe ser mayor a 0");
        }
        return valor;
    }

    public static double noNegativo(double valor, String campo) {
        if (valor < 0) {
            throw new IllegalArgumentException("El campo " + campo + " no puede ser negativo");
        }
        return valor;
    }

}

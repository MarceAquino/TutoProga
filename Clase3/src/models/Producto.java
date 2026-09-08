package models;

import utils.ValidationUtils;

public class Producto {
    private final String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = ValidationUtils.texto(nombre, "Nombre");
        this.precio = ValidationUtils.positivo(precio, "Precio");
        this.cantidadEnStock = (int) ValidationUtils.noNegativo(cantidadEnStock,"Cantidad de stock");
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    private static void validarDescuento(double porcentaje){
        if (porcentaje <= 0 || porcentaje >= 100) {
            throw new IllegalArgumentException("El porcentaje debe ser mayor a 0 y menor a 100");
        }
    }

    private void validarStock(int cantidadVenta){
        if (cantidadVenta > cantidadEnStock) {
            throw new IllegalStateException("Stock insuficiente, cantidad en el inventario " + getCantidadEnStock());
        }
    }

    public void aplicarDescuento(double porcentaje){
        validarDescuento(porcentaje);
        precio -= precio * (porcentaje /100) ;
    }

    public void realizarVenta(int cantidad){
        int cantidadVenta = (int) ValidationUtils.positivo(cantidad, "Cantidad");
        validarStock(cantidadVenta);
        cantidadEnStock -= cantidadVenta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }
}

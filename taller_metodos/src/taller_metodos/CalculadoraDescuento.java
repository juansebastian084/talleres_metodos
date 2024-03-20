/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_metodos;

/**
 *
 * @author juans
 */
public class CalculadoraDescuento {
    public static double calcularPrecioConDescuento(double precio, double descuento) {
        double porcentajeDescuento = descuento / 100;
        double precioConDescuento = precio - (precio * porcentajeDescuento);
        return precioConDescuento;
    }

    public static void main(String[] args) {
        double precio = 300;
        double descuento = 20;
        double precioConDescuento = calcularPrecioConDescuento(precio, descuento);
        System.out.println("El precio final con descuento es: " + precioConDescuento);
    }
}

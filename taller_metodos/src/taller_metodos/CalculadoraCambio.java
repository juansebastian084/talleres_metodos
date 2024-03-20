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
public class CalculadoraCambio {
    public static double calcularCambioDolaresAEuros(double dolares) {
        double tipoCambio = 1.33250;
        double euros = dolares / tipoCambio;
        return euros;
    }

    public static void main(String[] args) {
        double dolares = 100;
        double euros = calcularCambioDolaresAEuros(dolares);
        System.out.println("El cambio de " + dolares + " dólares a euros es: " + euros);
    }
}

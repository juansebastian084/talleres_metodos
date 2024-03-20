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
public class CalculadoraTiempoInverso {
    public static void convertirTiempo(int segundos, String tipo) {
        if (tipo.equalsIgnoreCase("dias")) {
            int dias = segundos / (24 * 60 * 60);
            System.out.println("Número de días: " + dias);
        } else if (tipo.equalsIgnoreCase("horas")) {
            int horas = segundos / (60 * 60);
            System.out.println("Número de horas: " + horas);
        } else if (tipo.equalsIgnoreCase("minutos")) {
            int minutos = segundos / 60;
            System.out.println("Número de minutos: " + minutos);
        } else {
            System.out.println("Tipo de conversión inválido. Por favor, selecciona 'dias', 'horas' o 'minutos'.");
        }
    }

    public static void main(String[] args) {
        int segundos = 86400; // Ejemplo: 86400 segundos corresponden a 1 día

        convertirTiempo(segundos, "dias");
    }
}

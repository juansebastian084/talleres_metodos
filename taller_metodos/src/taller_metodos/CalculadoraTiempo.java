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
public class CalculadoraTiempo {
    public static int calcularSegundos(int dias, int horas, int minutos) {
        int segundosPorDia = 24 * 60 * 60;
        int segundosPorHora = 60 * 60;
        int segundosPorMinuto = 60;

        int segundosTotales = (dias * segundosPorDia) + (horas * segundosPorHora) + (minutos * segundosPorMinuto);
        return segundosTotales;
    }

    public static void main(String[] args) {
        int dias = 2;
        int horas = 3;
        int minutos = 30;

        int segundosTotales = calcularSegundos(dias, horas, minutos);
        System.out.println("La cantidad de segundos totales es: " + segundosTotales);
    }
}

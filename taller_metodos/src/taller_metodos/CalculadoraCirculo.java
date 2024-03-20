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
public class CalculadoraCirculo {
    public static double calcularPerimetro(double radio) {
        double pi = 3.1416;
        double perimetro = 2 * pi * radio;
        return perimetro;
    }

    public static double calcularArea(double radio) {
        double pi = 3.1416;
        double area = pi * Math.pow(radio, 2);
        return area;
    }

    public static double calcularVolumen(double radio) {
        double pi = 3.1416;
        double volumen = (4 * pi * Math.pow(radio, 3)) / 3;
        return volumen;
    }

    public static void main(String[] args) {
        double radio = 5;
        String tipoCalculo = "perimetro"; 

        if (tipoCalculo.equals("perimetro")) {
            double perimetro = calcularPerimetro(radio);
            System.out.println("El perímetro de la circunferencia es: " + perimetro);
        } else if (tipoCalculo.equals("area")) {
            double area = calcularArea(radio);
            System.out.println("El área del círculo es: " + area);
        } else if (tipoCalculo.equals("volumen")) {
            double volumen = calcularVolumen(radio);
            System.out.println("El volumen de la esfera es: " + volumen);
        } else {
            System.out.println("Tipo de cálculo no válido");
        }
    }
}

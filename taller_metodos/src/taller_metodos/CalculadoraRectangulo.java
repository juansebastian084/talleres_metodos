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
public class CalculadoraRectangulo {
    public static double calcularPerimetro(double lado1, double lado2) {
        double perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public static double calcularArea(double base, double altura) {
        double area = base * altura;
        return area;
    }

    public static void main(String[] args) {
        double lado1 = 5;
        double lado2 = 8;
        String tipoCalculo = "perimetro"; // Cambia a "area" si deseas calcular el área en lugar del perímetro

        if (tipoCalculo.equals("perimetro")) {
            double perimetro = calcularPerimetro(lado1, lado2);
            System.out.println("El perímetro del rectángulo es: " + perimetro);
        } else if (tipoCalculo.equals("area")) {
            double area = calcularArea(lado1, lado2);
            System.out.println("El área del rectángulo es: " + area);
        } else {
            System.out.println("Tipo de cálculo no válido");
        }
    }
}

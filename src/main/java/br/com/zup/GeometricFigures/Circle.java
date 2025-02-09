package br.com.zup.GeometricFigures;

public class Circle implements GeometricFigure {
    // avançado: calcular a área de um círculo usando o valor de PI = 3,14

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
}

package br.com.zup.GeometricFigures;

public class Rectangle implements GeometricFigure {

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return base * altura;
    }
}
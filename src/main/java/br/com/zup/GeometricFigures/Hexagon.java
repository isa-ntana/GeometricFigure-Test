package br.com.zup.GeometricFigures;

public class Hexagon implements GeometricFigure {

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return (altura * base) / 2;
    }
}

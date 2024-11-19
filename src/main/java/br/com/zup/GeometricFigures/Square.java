package br.com.zup.GeometricFigures;

public class Square implements GeometricFigure {

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return Math.pow(base, 2);
    }
}

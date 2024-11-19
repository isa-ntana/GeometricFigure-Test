package br.com.zup.GeometricFigures;

public class Triangle implements GeometricFigure {

    @Override
    public double calcularArea(double base, double altura, double raio) {
        return (base*altura)/2;
    }
}

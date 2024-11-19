package br.com.zup.GeometricFigures.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FigureResponse {
    private String figure;
    private double area;

    public FigureResponse(String figure, double area) {
        this.figure = figure;
        this.area = area;
    }
}

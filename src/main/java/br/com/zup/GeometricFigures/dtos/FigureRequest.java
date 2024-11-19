package br.com.zup.GeometricFigures.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FigureRequest {
    private String figure;
    private double base;
    private double height;
    private double radius;
}

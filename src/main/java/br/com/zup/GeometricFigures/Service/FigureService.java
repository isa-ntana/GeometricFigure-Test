package br.com.zup.GeometricFigures.Service;

import br.com.zup.GeometricFigures.dtos.FigureResponse;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.List;

@Service
public class FigureService {

    private final List<FigureResponse> figureHistory = new ArrayList<>(); // Para armazenar o histórico de cálculos

    public double calculateArea(String figureType, double base, double height, double radius) {
        double area = 0.0;

        switch (figureType.toLowerCase()) {
            case "circle":
                area = Math.PI * Math.pow(radius, 2);
                break;
            case "square":
                area = Math.pow(base, 2);
                break;
            case "rectangle":
                area = base * height;
                break;
            case "triangle":
                area = (base * height) / 2;
                break;
            case "hexagon":
                area = (base * height) / 2;
                break;
            default:
                throw new IllegalArgumentException("Invalid figure type: " + figureType);
        }

        // Armazenar no histórico
        figureHistory.add(new FigureResponse(figureType, area));

        return area;
    }

    public List<FigureResponse> getAllFigures() {
        return figureHistory;
    }
}

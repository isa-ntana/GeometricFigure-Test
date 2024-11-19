package br.com.zup.GeometricFigures.Controller;

import br.com.zup.GeometricFigures.Service.FigureService;
import br.com.zup.GeometricFigures.dtos.FigureRequest;
import br.com.zup.GeometricFigures.dtos.FigureResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/figure")
public class FigureController {

    private final FigureService figureService;

    public FigureController(FigureService figureService) {
        this.figureService = figureService;
    }

    @PostMapping("/calculateArea")
    public FigureResponse calculateArea(@RequestBody FigureRequest figureRequest) {
        double area = figureService.calculateArea(figureRequest.getFigure(), figureRequest.getBase(), figureRequest.getHeight(), figureRequest.getRadius());
        return new FigureResponse(figureRequest.getFigure(), area);
    }

    @GetMapping
    public List<FigureResponse> getAllCalculatedFigures() {
        return figureService.getAllFigures();
    }
}

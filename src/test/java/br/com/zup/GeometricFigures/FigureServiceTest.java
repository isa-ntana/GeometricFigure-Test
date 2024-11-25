package br.com.zup.GeometricFigures;

import br.com.zup.GeometricFigures.Service.FigureService;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FigureServiceTest {

    private FigureService figureService;

    @BeforeEach
    void setUp() {
        figureService = new FigureService();
    }

    @Test
    void testCalculateAreaForCircle() {
        double radius = 3;
        double expectedArea = Math.PI * Math.pow(radius, 2);

        double area = figureService.calculateArea("circle", 0, 0, radius);

        assertEquals(expectedArea, area, "Área do círculo está incorreta");
    }

    @Test
    void testCalculateAreaForSquare() {
        double base = 4;
        double expectedArea = Math.pow(base, 2);

        double area = figureService.calculateArea("square", base, 0, 0);

        assertEquals(expectedArea, area, "Área do quadrado está incorreta");
    }

    @Test
    void testCalculateAreaForRectangle() {
        double base = 5;
        double height = 3;
        double expectedArea = base * height; // base * altura

        double area = figureService.calculateArea("rectangle", base, height, 0);

        assertEquals(expectedArea, area, "Área do retângulo está incorreta");
    }

    @Test
    void testCalculateAreaForTriangle() {
        double base = 6;
        double height = 4;
        double expectedArea = (base * height) / 2;

        double area = figureService.calculateArea("triangle", base, height, 0);

        assertEquals(expectedArea, area, "Área do triângulo está incorreta");
    }

    @Test
    void testCalculateAreaForHexagon() {
        double base = 6;
        double height = 4;
        double expectedArea = (base * height) / 2;

        double area = figureService.calculateArea("hexagon", base, height, 0);

        assertEquals(expectedArea, area, "Área do hexágono está incorreta");
    }

    @Test
    void testInvalidFigureType() {
        assertThrows(IllegalArgumentException.class, () -> {
            figureService.calculateArea("pentagon", 0, 0, 0); // "pentagon" não é uma figura válida
        });
    }
}

package br.edu.fatec.main.factory;

import br.edu.fatec.main.shapes.Square;
import br.edu.fatec.main.shapes.Rectangle;
import br.edu.fatec.main.shapes.Circle;
import br.edu.fatec.main.shapes.Diamond;
import br.edu.fatec.main.shapes.Parallelogram;
import br.edu.fatec.main.shapes.Trapezo;
import br.edu.fatec.main.shapes.Hexagon;
import br.edu.fatec.main.shapes.Cube;
import br.edu.fatec.main.shapes.Triangle;


public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Calculable getShape(ShapeType shapeType, double[] values) {
        switch (shapeType) {
            case SQUARE:
                return new Square(values[0]);

            case TRIANGLE:
                return new Triangle(values[0], values[1]);
        
            case RECTANGLE:
                return new Rectangle(values[0], values[1]);

            case CIRCLE:
                return new Circle(values[0]);

            case DIAMOND:
                return new Diamond(values[0], values[1]);

            case PARALLELOGRAM:
                return new Parallelogram(values[0], values[1]);

            case TRAPEZO:
                return new Trapezo(values[0], values[1], values[2]);

            case HEXAGON:
                return new Hexagon(values[0]);

            case CUBE: 
                return new Cube(values[0]);

            default:
                throw new IllegalArgumentException("Shape miss" + shapeType);

        }
    }
}

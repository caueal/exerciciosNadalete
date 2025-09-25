package br.edu.fatec.main;

import br.edu.fatec.main.factory.Calculable;
import br.edu.fatec.main.factory.ShapeFactory;
import br.edu.fatec.main.factory.ShapeFactoryImpl;
import br.edu.fatec.main.factory.ShapeType;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactoryImpl();

        Calculable square = shapeFactory.getShape(ShapeType.SQUARE, new double[]{2}); 
        System.out.println("Square area: " + square.calculateArea());

        Calculable triangle = shapeFactory.getShape(ShapeType.TRIANGLE, new double[]{3, 4});
        System.out.println("Triangle area: " + triangle.calculateArea());

        Calculable rectangle = shapeFactory.getShape(ShapeType.RECTANGLE, new double[]{5, 6});
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Calculable circle = shapeFactory.getShape(ShapeType.CIRCLE, new double[]{7});
        System.out.println("Circle area: " + circle.calculateArea());

        Calculable diamond = shapeFactory.getShape(ShapeType.DIAMOND, new double[]{8, 9});
        System.out.println("Diamond area: " + diamond.calculateArea());

        Calculable parallelogram = shapeFactory.getShape(ShapeType.PARALLELOGRAM, new double[]{10, 11});
        System.out.println("Parallelogram area: " + parallelogram.calculateArea());

        Calculable trapezo = shapeFactory.getShape(ShapeType.TRAPEZO, new double[]{12, 13, 14});
        System.out.println("Trapezo area: " + trapezo.calculateArea());

        Calculable hexagon = shapeFactory.getShape(ShapeType.HEXAGON, new double[]{15});
        System.out.println("Hexagon area: " + hexagon.calculateArea());

        Calculable cube = shapeFactory.getShape(ShapeType.CUBE, new double[]{16});
        System.out.println("Cube area: " + cube.calculateArea());
 
    }
    
}

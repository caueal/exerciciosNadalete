package br.edu.fatec.main.shapes;

public class Circle implements br.edu.fatec.main.factory.Calculable {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
}

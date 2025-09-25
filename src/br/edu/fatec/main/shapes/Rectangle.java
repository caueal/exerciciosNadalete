package br.edu.fatec.main.shapes;

public class Rectangle implements br.edu.fatec.main.factory.Calculable {
    
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
    
}

package br.edu.fatec.main.shapes;

public class Triangle implements  br.edu.fatec.main.factory.Calculable {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
    
}

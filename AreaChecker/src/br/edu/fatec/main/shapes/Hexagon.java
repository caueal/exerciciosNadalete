package br.edu.fatec.main.shapes;

public class Hexagon implements br.edu.fatec.main.factory.Calculable  {
    
    private double side; 

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }
    
}

package br.edu.fatec.main.shapes;

public class Cube implements br.edu.fatec.main.factory.Calculable  {
    
    private double side; 

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }
    
}

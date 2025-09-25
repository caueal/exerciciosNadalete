package br.edu.fatec.main.shapes;

public class Square implements br.edu.fatec.main.factory.Calculable  {
    
    private double side; 

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
    
}

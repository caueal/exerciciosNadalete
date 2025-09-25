package br.edu.fatec.main.shapes;

public class Diamond implements br.edu.fatec.main.factory.Calculable  {
    
    private double diagonal1;
    private double diagonal2;

    public Diamond(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }
    
}

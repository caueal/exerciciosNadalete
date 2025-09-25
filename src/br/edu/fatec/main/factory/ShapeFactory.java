package br.edu.fatec.main.factory;

public interface ShapeFactory {

    Calculable getShape(ShapeType shapeType, double[] values); //metodo para identificar a forma
    
}

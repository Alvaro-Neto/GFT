package Exercicio4;

public class Quadrado implements AreaCalculavel{

    public double side;

	public Quadrado(double side) {
        setLado(side);
    }

    public void setLado(double side) {
       this.side = side;
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(side, 2);
    }
}

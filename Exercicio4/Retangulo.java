package Exercicio4;

public class Retangulo implements AreaCalculavel {

    private double lenght;
    private double height;
    

    public Retangulo(double lenght, double height) {
    	setAltura(height);
        setLargura(lenght);
    }
    public void setAltura(double height) {
    	this.height = height;

    }
    public void setLargura(double lenght) {
        this.lenght = lenght;

    }

    @Override
    public double calcularArea() {
        return this.lenght * this.height;
    }
}




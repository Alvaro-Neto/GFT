package Exercicio4;

	public class Circulo implements AreaCalculavel {

	    
	    private double r;
	   

	    public Circulo(double r) {
	        setRaio(r);
	    }

	    public void setRaio(double r) {
	        this.r = r;
	    }

	    @Override
	    public double calcularArea() {
	        return Math.PI * Math.pow(this.r, 2);
	    }
	}

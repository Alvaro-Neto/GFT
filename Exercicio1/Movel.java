package Exercicio1;

public class Movel {
	
	public Movel (double valor, int quantidade) {
		super (valor, quantidade);
	}
	
	
	public double calcularValorFinal() {
		double valorFinal = valor * quantidade * 1.15;
		
		return valorFinal;
	}
}




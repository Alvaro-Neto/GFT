package Exercicio1;

public class Eletronico extends Produto{

	public Eletronico (double valor, int quantidade) {
		super (valor, quantidade);
	}
	
	@Override
	public double calcularValorFinal() {
		double valorFinal = valor * quantidade * 1.15;
		
		return valorFinal;
	}
}

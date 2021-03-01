package Exercicio1;

public class Produto {
	
	private String nome;
	private double valor;
	private int quantidade;
	
	public Produto(double valor, int quantidade){
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public double calcularValorFinal() {
		double valorFinal = valor * quantidade * 1.1;
		
		return valorFinal;
	}
}
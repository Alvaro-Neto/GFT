package Exercicio4;

public class Teste {
    public static void main(String[] args) {
        
        Quadrado quad = new Quadrado(3);
        Retangulo ret = new Retangulo(9, 8);
        Circulo circ = new Circulo(9);
        
        System.out.println("�rea do Quadrado: %.2f" + quad.calcularArea());
        System.out.println("�rea do Ret�ngulo: %.2f" + ret.calcularArea());
        System.out.println("�rea do C�ruclo: %.2f" + circ.calcularArea());
    }
}

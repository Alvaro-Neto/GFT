package Exercicio3;

import java.util.Scanner;

public class Intervalo {
	
	
	
	
	public static void main (String args[]) {
		
		System.out.println("Digite o intervalo inicial ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Digite o intervalo final ");
		int num2 = scan.nextInt();
		
		int interv = num2 - num1;
		
		if ( interv > 15) {
            System.out.println("\nIntervalo inicial: " + num1 + "| Intervalo final: " + num2 + "(intervalo = " + interv + ", inv�lido)");
        }else {
        	System.out.println("\nIntervalo inicial: " + num1 + "| Intervalo final: " + num2 + "(intervalo = " + interv + ", v�lido)");
        }

		
		
		
	}

}

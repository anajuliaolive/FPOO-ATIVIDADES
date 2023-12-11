package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int soma = 0;
		
		System.out.println("digite uma sequencia de numero");
		System.out.println("digite um numero negativo para parar:");
		
		while (true) {
			int numero = scanner.nextInt();
			if (numero <=0) {
				break;
			}
			soma = numero;
		}
		System.out.println("a soma dos numeros positivos digitado e:");
	}

}

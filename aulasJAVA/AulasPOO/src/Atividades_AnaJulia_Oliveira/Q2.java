package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int menorNumero = Integer.MAX_VALUE;
		System.out.println("Digite uma sequencia de numeros");
		System.out.println("Digite zero para parar");
		
		while (true) {
			int numero = scanner.nextInt();
			if (numero == 0) {
				break;
			}
			if (numero< menorNumero) {
				menorNumero = numero;
			}
			if (menorNumero == Integer.MAX_VALUE) {
				System.out.println("nenhum numero foi digitado");
			} else {
				System.out.println("o menor numero digitado e:" + menorNumero);
			}
		}
	}

}

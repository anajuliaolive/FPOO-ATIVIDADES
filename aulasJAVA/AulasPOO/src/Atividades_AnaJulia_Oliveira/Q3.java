package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num_aleatorio = (int) (Math.random() * 100) + 1;
		int tentativas;
		int contador = 0;
		System.out.println("Start...");
		
		do {//faça
			System.out.println("digite um numero de 1 a 30:");
			tentativas = entrada.nextInt();
			contador++;
			if (tentativas < num_aleatorio) {
				System.out.println("digite um MAIOR");
			} else if (tentativas < num_aleatorio) {
				System.out.println("digite um MENOR");
			} else {
				System.out.println("acertou!! parabens!");
			}
		} while (tentativas != num_aleatorio); //enquanto
		System.out.println("volte sempre!");
	}
}

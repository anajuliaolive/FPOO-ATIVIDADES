package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Contas3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int valor = entrada.nextInt();
		int acougue = entrada.nextInt();
		int farmacia = entrada.nextInt();
		int padaria = entrada.nextInt();
		int resp = 0;
		int [] contas = {acougue, farmacia, padaria};
		
		if (contas[0] + contas[1] + contas [2] <= valor) {
			resp = 3;
		}
		else if (contas[0] + contas[1] <= valor) {
			resp = 2;
		}
		else if (contas[0] <= valor) {
			resp = 1;
		}
		else {
			System.out.printf("%d\n", resp);
		}
		    
	}

}

package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Conta2 {

	public static void main(String[] args) {
		int V,A,P,F;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe valor disponivel: ");
		V = entrada.nextInt();
		System.out.println("Valor primeira conta: ");
		A = entrada.nextInt();
		System.out.println("Valor segunda conta: ");
		F = entrada.nextInt();
		System.out.println("Valor terceira conta: ");
		P = entrada.nextInt();

		if (V >= (A + F + P)) {
			System.out.println("3");
		} else if (V >= (A + F) || V >= (A + P)) {
			System.out.println("2");
		}
	}

}

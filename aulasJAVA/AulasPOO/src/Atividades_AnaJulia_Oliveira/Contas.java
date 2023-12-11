package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor disponivel para pagar: ");
		int V = entrada.nextInt();
		System.out.print("Valor primeira conta: ");
		int A = entrada.nextInt();
		System.out.print("Valor segunda conta: ");
		int F = entrada.nextInt();
		System.out.print("Valor terceira conta: ");
		int P = entrada.nextInt();
		
		if (V < A && V < F && V < P) {
			System.out.print("Paga nenhuma conta ");
		}
		if (V >= A) {
			System.out.print("Paga a primeira conta ");
			V = V - A;
		}
		if (V >= F) {
			System.out.print("Paga a segunda conta ");
		}
		if (V >= P) {
			System.out.print("Paga a terceira conta ");
		}
	}
}

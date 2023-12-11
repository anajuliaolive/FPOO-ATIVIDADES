package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Var {

		public static void main(String[] args) {
			int resultado;
			Scanner entrada = new Scanner(System.in);
			System.out.println("posicao x:");
			int x = entrada.nextInt();
			System.out.println("posicao y:");
			int y = entrada.nextInt();
			if (x < - 8 || x > 8 || y< 0 || y > 0) {
				System.out.println("bola foi dentro");
				
			}else {
				
			}System.out.println("bola foi fora");
	}
}

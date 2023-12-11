package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {
			exibirMenu(); 
			opcao = entrada.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("digite 1");
				break;
			case 2: 
				System.out.println("digite 2");
				break;
			case 3:
				System.out.println("digite 3");
				break;
			default:
				System.out.println("escolha as opcoes 1 a 3");
				break;
			}
			System.out.println();
			
		}while(opcao !=0);

	}// fim main
	
	public static void exibirMenu() {
				System.out.println("Selecione uma opção:");
				System.out.println("1 - SUBTRAIR");
				System.out.println("2 - MULTIPLICAR");
				System.out.println("3 - SOMAR");
				System.out.println("4 - DIVIDIR");
	}

}

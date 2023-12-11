package Aula_0208;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		double resultado;
		do {
			exibirMenu(); // metodo (acao)
			opcao = entrada.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("opcao acao");
				System.out.println("digite 1º opcao");
				double num1 = entrada.nextDouble();
				System.out.println("digite 2º opcao");
				double num2 = entrada.nextDouble();
				resultado = num1 + num2;
				System.out.println("resultado =" + resultado);
				break;
			case 2: 
				System.out.println("opcao 2 selecionada");
				break;
			case 3:
				System.out.println("opcao 3 selecionada");
				break;
			default:
				System.out.println("escolha as opcoes 1 a 3");
				break;
			}
			System.out.println();
			
		}while(opcao !=0);

	}// fim main
	
	// metodo para exibir menu de opções (fora do main)
	public static void exibirMenu() {
				System.out.println("Selecione uma opção:");
				System.out.println("1 - opcao 1");
				System.out.println("2 - opcao 2");
				System.out.println("3 - op 3");
				System.out.println("0 - SAIR");
	}
}// fim classe

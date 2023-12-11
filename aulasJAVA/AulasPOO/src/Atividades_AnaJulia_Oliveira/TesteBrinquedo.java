package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class TesteBrinquedo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("escolha um brinquedo");
		System.out.println("pula pula-1");
		System.out.println("escorregador-2");
		Brinquedo b1 = new Brinquedo ();
		Visitante v1 = new Visitante ();
		int escolha;
		do {
		escolha = entrada.nextInt();
		switch (escolha) {
		case 1:
			System.out.println("digite seu nome:");
			v1.trocarNome = entrada.next();
		    System.out.println("digite sua idade:");
		    v1.trocarIdade = entrada.nextInt();
		    System.out.println("digite sua altura:");
		    v1.trocarAltura = entrada.nextDouble();
		    if (v1.trocarIdade <15 || v1.trocarAltura <= b1.getAlturaMinima());
		    System.out.println("você nn pode entrar");
			break;
		}
		
		}while (escolha < 0)	;
	}

}

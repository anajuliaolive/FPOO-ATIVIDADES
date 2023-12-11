package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class TesteBrinquedo2 {

	public static void main(String[] args) {
		//scanner e system (permite a entrada de dados)
		Scanner entrada = new Scanner (System.in);
		//instancia de objetos
		System.out.println("informe os dados do brinquedo 1");
		System.out.println("nome:");
		String nomeMontanhaRussa = entrada.nextLine(); //pega a linha inteira da String
		System.out.println("altura minima: (em metros)");
		double alturaMinimaMontanhaRussa = entrada.nextDouble();
		System.out.println("capacidade maxima:");
		int capacidadeMaximaMontanhaRussa = entrada.nextInt();
		//agora estamos instanciando objetos a classe brinquedo
		Brinquedo2 montanhaRussa = new Brinquedo2(nomeMontanhaRussa, alturaMinimaMontanhaRussa, capacidadeMaximaMontanhaRussa);
		
		
		// **** instanciar o 2° brinquedo ***
		System.out.println("informe os dados do brinquedo 2");
		System.out.println("nome:");
		String nomePulaPula = entrada.nextLine();
		System.out.println("altura minima: (em metros)");
		double alturaMinimaPulaPula = entrada.nextInt();
		System.out.println("capacidade maxima");
		int capacidadeMaximaPulaPula = entrada.nextInt();
		Brinquedo2 pulaPula = new Brinquedo2(nomePulaPula, alturaMinimaPulaPula, capacidadeMaximaPulaPula);
		
		System.out.println("informe os dados do visitante 1");
	    System.out.println("nome:"); 
		String nomeVisitante1 = entrada.nextLine();
		System.out.println("idade:");
		int idadeVisitante1 = entrada.nextInt();
		System.out.println("altura:");
		double alturaVisitante1 = entrada.nextInt();
		
		//instancia do objeto visitante1
		Visitante2 visitante1 = new Visitante2(nomeVisitante1, idadeVisitante1, alturaVisitante1);
		System.out.println("informações do brinquedo 1");
		montanhaRussa.exibirInfo();
		
		System.out.println("informações do visitante 1");
		visitante1.exibirInfo();
		//vamos verificar se o visitante pode ou nn andar no brinquedo
		System.out.println("pode andar na montanha russa?" + (visitante1.PodeAndarNoBrinquedo() ? "sim" : "nao"));


	}
	

}

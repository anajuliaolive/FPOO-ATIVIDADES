package Aula_2308;

import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cor;
		double tamanho;
		String material;
		String decoracao;
		Vaso vas1 =  new Vaso();
		vas1.getCor();
		vas1.getMaterial();
		vas1.getTamanho();
		vas1.resultado();
		
		VasoDecorado va1 =  new VasoDecorado();
		va1.setDecoracao(entrada.nextLine());
		va1.getDecoracao();
		va1.resultado();
		

		
		
		

	}

}

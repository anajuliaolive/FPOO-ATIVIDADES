package Aula06_09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteVoo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		LocalDate dataIda = null;
		LocalDate dataVolta = null;
		
		//instanciando do passageiro
		Passageiro p1 = new Passageiro();
		System.out.println("===== Informe seus dados: =====");
		System.out.println("Nome: ");
		p1.setNome(entrada.next());
		System.out.println("Sobrenome: ");
		p1.setSobreNome(entrada.next());
		System.out.println("Email:");
		p1.setEmail(entrada.next());
		
		//instanciando do voo
		int i = 1;
		System.out.println("Quantas passagens voce deseja comprar:");
		entrada.nextInt();
		while( i < 3) {
		Voo v1 = new Voo("FMTER55PD", "", null, 3000f, dataVolta, dataVolta);
		System.out.println("Insira os dados do seu " + i + " voo: ");
		System.out.println("Origem:");
		v1.setOrigem(entrada.next());
		System.out.println("Destino:");
		v1.setDestino(entrada.next());
		System.out.println("Data ida(dd-MM-yyyy):");
		String dataI = entrada.next();
		dataIda = LocalDate.parse (dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Data volta(dd-MM-yyyy):");
		String dataV = entrada.next();
		dataVolta = LocalDate.parse (dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("--------------------------------PASSAGEM-------------------------------------");
		Passagem passagem1 = new Passagem();
		System.out.println("Nome: " + p1.getNome() + "\nSobrenome: " + p1.getSobrenome() + "\nNumero do voo: " + v1.getNumeroVoo() +

		"\nOrigem do voo: " + v1.getOrigem() + "\nDestino do voo: " + v1.getDestino() + "\nPreco do voo: " + v1.getPreco());
		i++;
		System.out.println("----------------------------------------------------------------------------------------");
		}
}
}

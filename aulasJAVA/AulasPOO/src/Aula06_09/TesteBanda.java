package Aula06_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Banda b1 = new Banda();
		Vocalista v1 = new Vocalista();
		Guitarrista g1 = new Guitarrista();
		Baixista baix1 = new Baixista();
		Baterista bat1 = new Baterista();
		System.out.println("==== BANDA 1 ====");
		System.out.println("digite o nome da sua banda:");
		b1.setNome(entrada.next());
		System.out.println("digite o nome do vocalista:");
		v1.setNome(entrada.next());
		System.out.println("digite o nome guitarrista:");
		g1.setNome(entrada.next());
		System.out.println("digite o nome baixista:");
		baix1.setNome(entrada.next());
		System.out.println("digite o nome baterista:");
		bat1.setNome(entrada.next());
		
		List<MembroBanda> membros = new ArrayList<MembroBanda>();
		membros.add(v1);
		membros.add(g1);
		membros.add(baix1);
		membros.add(bat1);
		for (MembroBanda visualizar : membros) {
	         System.out.println("\nos membros sao:" + visualizar.getNome());
		}
	}

}

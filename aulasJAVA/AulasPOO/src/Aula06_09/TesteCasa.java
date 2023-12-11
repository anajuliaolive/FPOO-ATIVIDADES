package Aula06_09;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Casa ca1 = new Casa();
		System.out.println("===== CASA 1 =====");
		System.out.println("qual a cor da casa:");
		ca1.setCor(entrada.next());
		System.out.println("qual o preco da casa:");
		ca1.setPreco(entrada.nextFloat());
		System.out.println("qual a metragem da casa:");
		ca1.setMetragem(entrada.nextFloat());
		System.out.println("quantas camas tem sua casa:");
		ca1.setNumeroCamas(entrada.nextInt());
		
		Sala s1 = new Sala ();
	    System.out.println("tem TV na sala:");
	    s1.setTemTV(entrada.nextBoolean());
	    
		Casa comodos = new  Casa ();
	    System.out.println("SUA CASA...");
	    System.out.println("tem cor: " + ca1.getCor()  );
	    System.out.println("tem o valor de: " + "R$"  + ca1.getPreco() );
	    System.out.println("tem a metragem de: " + ca1.getMetragem() );
	    System.out.print("quantas camas tem sua casa: "+ ca1.getNumeroCamas() );
	    
	    Sala salas = new Sala ();
	    System.out.println("\nna sua sala tem tv:" + s1.getTemTV() );
	    
	    Casa ca2 = new Casa();
	    System.out.println("===== CASA 2 =====");
		System.out.println("qual a cor da casa:");
		ca2.setCor(entrada.next());
		System.out.println("qual o preco da casa:");
		ca2.setPreco(entrada.nextFloat());
		System.out.println("qual a metragem da casa:");
		ca2.setMetragem(entrada.nextFloat());
		System.out.println("quantas camas tem sua casa:");
		ca2.setNumeroCamas(entrada.nextInt());
	    
		Casa comodos2 = new  Casa ();
	    System.out.println("SUA CASA...");
	    System.out.println("tem cor: " + ca2.getCor()  );
	    System.out.println("tem o valor de: " + "R$"  + ca2.getPreco() );
	    System.out.println("tem a metragem de: " + ca2.getMetragem() );
	    System.out.print("quantas camas tem sua casa: "+ ca2.getNumeroCamas() );
	    
	}

}

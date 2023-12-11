package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SpeedBike sbike1 = new SpeedBike ();
		MountainBike mbike1 = new MountainBike ();
		
		SpeedBike sbike2 = new SpeedBike ();
		MountainBike mbike2 = new MountainBike ();
		
		System.out.println("---- PESSOA 1----");
		System.out.println("digite seu nome:");
		String nome = entrada.next();
		System.out.println("digite sua idade:");
		int idade = entrada.nextInt();
	    System.out.println("voce quer subir na bike:");
	    String Subir = entrada.next();
		sbike1.mudarMarcha(0);
        System.out.println("digite o valor da marcha:");
        int mudarMarcha = entrada.nextInt();
        System.out.println("digite o valor da velocidade:");
        int velocidade = entrada.nextInt();
        System.out.println("----------------------");
        
        PessoaSpeed ps1 = new PessoaSpeed ();
        ps1.setNome (nome);
        ps1.setIdade(idade);
        ps1.setSubir();
        sbike1.setMarcha (mudarMarcha);
        sbike1.setVelocidade(velocidade);
        System.out.println("seu nome:" + ps1.getNome ());
        System.out.println("sua idade:" + ps1.getIdade());
        System.out.println("sua marcha:" + sbike1.marcha);
        System.out.println("sua velocidade:" + sbike1.velocidade);
        
        
        System.out.println("---- PESSOA 2----");
		System.out.println("digite seu nome:");
		String nome1 = entrada.next();
		System.out.println("digite sua idade:");
		int idade1 = entrada.nextInt();
	    System.out.println("voce quer subir na bike:");
	    String subir1 = entrada.next();
		sbike1.setMarcha(0);
        System.out.println("digite o valor da marcha:");
        int mudarMarcha1 = entrada.nextInt();
        System.out.println("digite o valor da velocidade:");
        int velocidade1 = entrada.nextInt();
        System.out.println("----------------------");
        
     
        

	}

}

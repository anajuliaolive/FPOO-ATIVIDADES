package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    Pao p1 = new Pao();
		Bolo b1 = new Bolo();
		Doce d1 = new Doce();
		
        Pao p2 = new Pao ();
        Bolo b2 = new Bolo ();
        Doce d2  = new Doce  ();

	    System.out.println("---- PAOZINHO 1----");
	    System.out.println("digite qual pao voce quer:");
	    String nome = entrada.next();
        p1.setNome(nome);
        System.out.println("digite o valor:");
        double preco = entrada.nextDouble();
        p1.setPreco(preco);
        System.out.println("INFORMACOES:");
        p1.exibir(nome, preco);
        System.out.println("----------------------");

        
	    System.out.println("---- BOLINHO 1 ----");
        System.out.println("digite o sabor do bolo:");
        String nome1 = entrada.next();
        b1.setNome(nome1);
        System.out.println("digite o valor:");
        double preco1 = entrada.nextDouble();
        b1.setPreco(preco1);
	    System.out.println("INFORMACOES:");
        b1.exibir(nome1, preco1);
        System.out.println("----------------------");

        
        System.out.println("---- DOCINHO 1----");
        System.out.println("digite o sabor do doce:");
        String nome2 = entrada.next();
        d1.setNome(nome2);
        System.out.println("digite o valor:");
        double preco2 = entrada.nextDouble();
        d1.setPreco(preco2);
	    System.out.println("NFORMACOES:");
        d1.exibir(nome2, preco2);
        System.out.println("----------------------");

        
	    System.out.println("---- PAOZINHO 2----");
	    System.out.println("digite o sabor do segundo pao:");
        String nome3 = entrada.next();
        p2.setNome(nome3);
        System.out.println("qual o valor:");
        double preco3 = entrada.nextDouble();
        p2.setPreco(preco3);
	    System.out.println("INFORMACOES:");
        p2.exibir(nome3, preco3);
        System.out.println("----------------------");
        
        
        System.out.println("---- BOLINHO 2 ----");
        System.out.println("digite o sabor do segundo bolo:");
        String nome4 = entrada.next();
        b2.setNome(nome4);
        System.out.println("qual o valor:");
	    double preco4 = entrada.nextDouble();
	    b2.setPreco(preco4);
	    System.out.println("INFORMACOES:");
	    b2.exibir(nome4, preco4);
	    System.out.println("----------------------");

	    
	    System.out.println("---- DOCINHO 2 ----");
	    System.out.println("digite o sabor do segundo doce:");
	    String nome5 = entrada.next();
	    d2.setNome(nome5);
	    System.out.println("digite o preco:");
	    double preco5 = entrada.nextDouble();
	    d2.setPreco(preco5);
	    System.out.println("INFORMACOES:");
	    d2.exibir(nome5, preco5);
	    System.out.println("----------------------");

	    
	    PessoaPadaria pes1 = new  PessoaPadaria ();
	    pes1.nome(nome5);
	    System.out.println("VOCE ESTA COMENDO...");
	    System.out.println("comendo um pao:  " + p1.getNome()  );
	    System.out.println("comendo um bolo:  " + b1.getNome() );
	    System.out.println("comendo um doce:  "+ d1.getNome() );
	    System.out.println("comendo outro doce: " + d1.getNome());
	  }
}
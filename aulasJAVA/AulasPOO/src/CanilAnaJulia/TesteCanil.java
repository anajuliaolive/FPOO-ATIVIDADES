package CanilAnaJulia;

import java.util.Scanner;

public class TesteCanil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Pessoa p1 = new Pessoa();
		System.out.println("===== Pessoa 1 =====");
		System.out.println("digite seu nome:");
		p1.setNome(entrada.next());
		System.out.println("digite seu sobrenome:");
		p1.setSobrenome(entrada.next());
		System.out.println("digite seu telefone:");
		p1.setTelefone(entrada.nextInt());
		System.out.println("digite seu genero: ");
		p1.setSexo(entrada.next());
		
		Cachorro c1 = new Cachorro();
		System.out.println("===== Cachorro 1 =====");
		System.out.println("digite o nome do cao:");
		c1.setNome(entrada.next());
		System.out.println("digite a raca do cao:");
		c1.setRaca(entrada.next());
		System.out.println("digite a cor do cao:");
		c1.setCor(entrada.next());
		System.out.println("digite a idade do cao: ");
		c1.setIdade(entrada.nextInt());
		System.out.println("digite o genero do cao: ");
		c1.setSexo(entrada.next());
		System.out.println("digite 1 para latir e 0 para nn latir:");
		c1.setI(entrada.nextInt());
		c1.latir();
		System.out.println("digite 1 para correr e 0 para parar:");
		c1.setI(entrada.nextInt());
		c1.correr();
		
		Canil ca1 = new Canil();
		System.out.println("===== Canil =====");
		System.out.println("digite o nome do canil:");
		ca1.setNome(entrada.next());
		System.out.println("digite o telefone:");
		ca1.setTelefone(entrada.nextInt());
		System.out.println("digite o endereco:");
		ca1.setEndereco(entrada.next());
		System.out.println("o cachorro fuigiu! digite 1 para guarda-lo:");
		ca1.setI(entrada.nextInt());
		ca1.guardarCachorro();
		
		Carrocinha car1 = new Carrocinha();
		System.out.println("===== Carrocinha =====");
		System.out.println("seu cachorro foi pegon pela carrocinha, digite 1 para esgata-lo:");
		car1.setI(entrada.nextInt());
		car1.resgatarCachorro();
		
		Veterinario v1 = new Veterinario();
		System.out.println("===== Veterinario =====");
		System.out.println("digite o nome do cachorro:");
		v1.setNome(entrada.next());
		System.out.println("digite a idade do cachorro:");
		v1.setIdade(entrada.nextInt());
		System.out.println("digite a altura do cachorro:");
		v1.setAltura(entrada.nextDouble());
		System.out.println("seu cachorro esta doente, digite 1 para leva-lo ao veterinario:");
		v1.setI(entrada.nextInt());
		v1.tratarCachorro();
		
		

	}

}

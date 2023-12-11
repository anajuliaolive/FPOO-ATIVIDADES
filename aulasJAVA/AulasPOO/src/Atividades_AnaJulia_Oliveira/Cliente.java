package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

import Aula_1408.Carro;

public class Cliente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Academia cl1 = new Academia ();
		System.out.println("digite seu nome:");
		cl1.nome = entrada.next();
		System.out.println("digite sua idade:");
		cl1.idade = entrada.nextInt();
		System.out.println("digite seu cpf:");
		cl1.cpf = entrada.nextDouble();
		System.out.println("digite seu telefone:");
		cl1.telefone = entrada.nextDouble();
		System.out.println("digite seu peso:");
		cl1.peso = entrada.nextFloat();
		System.out.println("digite sua altura:");
		cl1.altura = entrada.nextFloat();
		System.out.println(cl1.setImc());
		System.out.println("digite seu seu peso desejavel:");
		cl1.desejavel = entrada.nextFloat();
        System.out.println(cl1.setDesejavel());
	}

}

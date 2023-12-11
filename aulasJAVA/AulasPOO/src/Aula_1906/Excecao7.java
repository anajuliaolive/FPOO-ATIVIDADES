package Aula_1906;

import java.util.Scanner;

public class Excecao7 {

	public static void main(String[] args) {
		String cpf; //462.487.408-01 válido!
		Scanner entrada = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("digite o cpf:");
				cpf =  entrada.nextLine();
				if(!validarCPF(cpf)) {
					throw new IllegalArgumentException("CPF invalido!" + "digite novamente!");
				}
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("CPF valido!" + cpf);
		entrada.close();
	}	
		

		//criar função para validar CPF
		public static boolean validarCPF(String cpf){//boolean pq ou digitou certo ou errado
			cpf = cpf.replace("\\D", "");
			//verifica quantidade de caracteres
			if(cpf.length() !=11) {
				return false;
			}
			//verificar se os digitos sao todos iguais
			if(cpf.matches("\\d\\\1{10}")) {
				return false;
			}
			return true;
	}

}

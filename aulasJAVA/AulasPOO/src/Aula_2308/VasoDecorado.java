package Aula_2308;

import java.util.Scanner;

public class VasoDecorado extends Vaso{
	//atributos
	Scanner entrada = new Scanner (System.in);
	private String decoracao;
	public String resultado;
	
	//metodo construtor
	public VasoDecorado() {
	 
	}
	public VasoDecorado(String decoracao) {
		super();
		this.decoracao = decoracao;
		System.out.println("vaso decorado");
	}
	public void setDecoracao (String decoracao) {
		System.out.println("informe a decoracao do vaso:");
		decoracao = entrada.next();
		this.decoracao = decoracao;
	}
	public String getDecoracao() {
		return decoracao;
	}
	public String resultado() {
		System.out.println("decoracao: " + decoracao + "\n");
		return resultado;
		
	}

}

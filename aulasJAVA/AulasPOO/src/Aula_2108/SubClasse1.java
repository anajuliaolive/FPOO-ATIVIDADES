package Aula_2108;

public class SubClasse1 extends ClassePai {
	//atributos ?????
	
	//metodo construtor
	public SubClasse1() {
		super();
		nome = super.nome;
		System.out.println("imprimi na SubClasse1 ???");
		super.metodoImprimir();
	}
}

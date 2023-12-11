package Aula_2308;

public class CaixaEletronico { //serviço 24h (varios bancos)
	//atributos
	//construtores
	//getters e setters 
	//metodo especial
	public void sacar(double valor) {
		valor = valor + 0.5;//taxa cobrada pela transação
		System.out.println("o seu saque no caixa eletronico" + "foi =" + valor);
	}

}

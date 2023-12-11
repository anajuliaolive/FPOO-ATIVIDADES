package Aula_2308;

public class Santander extends CaixaEletronico {
	@Override //seobrescrita de metodo
	public void sacar(double valor) {
		valor = valor + 3.2;//taxa cobrada pela transação
		System.out.println("o seu saque no Santander" + "foi =" + valor);
	}
}

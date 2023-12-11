package Aula06_09;


public class Passagem {
	//aribiutos
	private Voo voo;
	private Passageiro cliente;
	private double precoTotal;
	//construtor padrão
	public Passagem () {			
	}
		
	//contrutor com parâmetros
	public Passagem (Voo voo, Passageiro cliente, double precoTotal) {
		this.voo = voo;
		this.cliente = cliente;
		this.precoTotal = precoTotal;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Passageiro getCliente() {
		return cliente;
	}

	public void setCliente(Passageiro cliente) {
		this.cliente = cliente;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	

}

package Aula06_09;

import java.time.LocalDate;

public class Voo {
	//atributos
	private String numeroVoo;
	private String origem;
	private String destino;
	private double preco;
	private LocalDate dataIda;
	private LocalDate dataVolta;
	//construtor padrao
	public Voo() {
		
	}
	public Voo(String numeroVoo, String origem, String destino, double preco, LocalDate dataIda, LocalDate dataVolta) {
		super();
		this.numeroVoo = numeroVoo;
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
	}
	//construtor com parametros
	
	public String getNumeroVoo() {
		return numeroVoo;
	}
	
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getDataIda() {
		return dataIda;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
	
	
	
	
	

}

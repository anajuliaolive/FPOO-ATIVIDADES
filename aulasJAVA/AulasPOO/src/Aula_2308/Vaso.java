package Aula_2308;

import java.util.Scanner;

public class Vaso {
	Scanner entrada = new Scanner (System.in);
	//atributos
	private String cor;
	private double tamanho;
	private String material;
	public String resultado;
	
	//metodo construtor
	public Vaso() {
		
	}
	public void setCor(String cor) {
		
		this.cor = cor;
	}
	public String getCor() {
		System.out.println("informe a cor do vaso1:");
		cor = entrada.next();
		return cor;
	}
	public void setTamanho(double tamanho) {
		
		this.tamanho = tamanho;
	}
	public double getTamanho() {
		System.out.println("informe o tamanho do caso:");
		tamanho = entrada.nextDouble();
		return tamanho;
	}
	public void setMaterial(String material) {
		
		this.material = material;
	}
	public String getMaterial() {
		System.out.println("informe o material do caso:");
		material = entrada.next();
		return material;
	}
	public String resultado() {
		System.out.println("cor: " + cor + "\n" + "material: " + material + "\n" + "tamanho: " + tamanho);
		return resultado;	
	}
	
}

package Aula_2108;

import java.util.Scanner;

public class Pessoa {
	Scanner entrada = new Scanner (System.in);
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;
	
	public Pessoa () {
	}
	public void setNome(String nome) {
		System.out.println("digite seu nome:");
		nome = entrada.next();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEndereco(String endereco) {
		System.out.println("qual o seu endereco:");
		endereco = entrada.next();
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setTelefone(int telefone) {
		System.out.println("qual o seu telefone:");
		telefone = entrada.nextInt();
		this.telefone = telefone;
	}
	public int getTefefone() {
		return telefone;
	}
	public void setCpf(int cpf) {
		System.out.println("qual o seu cpf:");
		cpf = entrada.nextInt();
		this.cpf = cpf;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCelular(int celular) {
		System.out.println("qual o seu celular:");
		celular = entrada.nextInt();
		this.celular = celular;
	}
	public int getCelular() {
		return celular;
	}

}

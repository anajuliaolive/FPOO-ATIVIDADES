package Aula06_09;

import java.util.List;

public class Banda {
	//atributos
	private String nome;
	private List<MembroBanda> membros;
	//construtor padrão
	public Banda() {			
	}
	//contrutor com parâmetros
	public Banda (String nome, List<MembroBanda> membros) {
		this.nome = nome;
		this.membros = membros;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<MembroBanda> getMembros() {
		return membros;
	}
	public void setMembros(List<MembroBanda> membros) {
		this.membros = membros;
	}
	//metodos
	public void adicionarMembro() {
		System.out.println("digite o nome do membro:" + nome);
	}
	public void realizarShow() {
		
	}

}

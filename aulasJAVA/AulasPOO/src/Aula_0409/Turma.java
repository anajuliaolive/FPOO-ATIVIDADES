package Aula_0409;

import java.util.List;

public class Turma {
	//atributos 
	public String nome;
	private List<Estudante> estudantes; //agregação
	
	//construtor padrao
	public Turma() {
	}
	//construtor com parametros
	public Turma(String nome,List<Estudante> estudantes) {
		this.nome = nome;
		this.estudantes = estudantes;
	}
	//metodos
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCursos(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
	public List<Estudante> getEstudantes() {
		return estudantes;
	}

}

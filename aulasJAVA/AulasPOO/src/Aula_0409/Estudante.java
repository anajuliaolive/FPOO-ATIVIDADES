package Aula_0409;

public class Estudante {
	//atributos 
	public String nome;
	public int ra;
	public String curso;
		
	//construtor padrao
	public Estudante() {
	}
	//construtor com parametros
	public Estudante(String nome,int ra, String curso ) {
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
	}

}

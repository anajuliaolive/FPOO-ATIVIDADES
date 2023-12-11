package Aula_0409;

public class Pessoa {
	//atributos
	public String cargo;
	public String nome;
	public int idade;
	
	//construtor padrao
	public Pessoa () {
	}
	
	//construtor com parametros
	public Pessoa (String cargo, String nome, int idade) {
		this.cargo = cargo;
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setCargo (String cargo) {
		this.cargo = cargo;
	}
	
	public String getCargo () {
		return cargo;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public int getIdade () {
		return idade;
	}
	

}

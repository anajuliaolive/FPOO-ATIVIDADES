package Aula_2308;

public class Animal1 {
	//atributos
	private String nome;
    //metodo construtor
	public Animal1(String nome) {
		this.nome = nome;
	}
	public void emitirSom() {
		System.out.println("o animal esta fazendo um som");
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}   


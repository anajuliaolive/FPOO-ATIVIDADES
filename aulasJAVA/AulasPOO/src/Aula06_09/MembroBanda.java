package Aula06_09;

public class MembroBanda extends Banda{
	//atributos
	private String nome;
	
	//construtor padrão
	public MembroBanda() {			
	}
	
	//contrutor com parâmetros
	public MembroBanda (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//metodos
	public void tocar() {
		System.out.println("você esta tocando:");
	}

}

package Aula06_09;

public class Passageiro {
	private String nome;
	private String sobrenome;
	private String email;
	//construtor padrao
	public Passageiro() {
	}
	//construtor com parametros 
	
	public String getNome() {
		return nome;
	}
	public Passageiro(String nome, String sobrenome, String email) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobrenome = sobreNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}

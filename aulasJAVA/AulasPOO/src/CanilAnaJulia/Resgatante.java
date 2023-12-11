package CanilAnaJulia;

public class Resgatante {
	private String nome;
	private String sobrenome;
	private int idade;
	private char sexo;
	private int telefone;
	
	public Resgatante() {
		
	}
	public Resgatante(String nome, String sobrenome, int idade, char sexo, int telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
    public void resgatarCachorro() {
		System.out.println("resgatando um cachorro");
	}
	
	

}

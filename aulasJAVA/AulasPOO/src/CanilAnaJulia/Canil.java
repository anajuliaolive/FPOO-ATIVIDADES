package CanilAnaJulia;

public class Canil {
	//atributos
	private String nome;
	private int telefone;
	private String endereco;
	int i;
	//construtor padrao
	public Canil () {
		
	}
	//construtor com parametros 
	public Canil(String nome, int telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	//metodos
	public void guardarCachorro() {
		if(i>=1) {
			System.out.println("guardaram o cachorro!");
		}else {
			System.out.println("o cachorro escapou!");
		}
	}
	

}

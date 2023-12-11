package CanilAnaJulia;

public class Cachorro {
	private String nome;
	private String raca;
	private String cor;
	private int idade;
	private String sexo;
	int i;
	
	public Cachorro() {
		
	}
	public Cachorro(String nome, String raca, String cor, int idade, String sexo) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	//metodos
	public void latir() {
		if(i>=1) {
			System.out.println("o cachorro esta latindo!");
		}else {
			System.out.println("o cachorro esta quieto!");
		}
	}
	public void correr() {
		if(i>=1) {
			System.out.println("o cachorro esta correndo!");
		}else {
			System.out.println("o cachorro esta parado!");
		}
	}
	
	
	
	

}

package CanilAnaJulia;

public class Veterinario {
	private String nome;
	private int idade;
	private double altura;
	int i;
	public Veterinario() {
	}

	public Veterinario(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public void tratarCachorro() {
		if(i>=1) {
			System.out.println("voce tratou o cachorro!");
		}else {
			System.out.println("o cachorro esta doente!");
		}
	}
	
	
	

}

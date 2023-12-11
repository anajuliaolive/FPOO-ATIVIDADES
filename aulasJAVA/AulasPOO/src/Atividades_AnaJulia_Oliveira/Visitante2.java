package Atividades_AnaJulia_Oliveira;

public class Visitante2 {
	private String nome;
	private int idade;
	private double altura;
	
	public Visitante2() {
		
	}
	public Visitante2 (String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public boolean PodeAndarNoBrinquedo;
	public String getNome() {
		return nome;
	} 
	public void setTrocarNome(String nom) {
		this.nome = nom;
	}
	public int getIdade() {
		return idade;
	}
	public void setTrocarIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	} 
	public void trocarAltura(double altura) { 
		this.altura = altura;
	}
	public boolean PodeAndarNoBrinquedo() {
	       if (idade >= 10 && altura >= 1.5) {
	        return true;
	       }else {
	           return false;
	       }
	    }
	public void exibirInfo () {
		System.out.println("visitante:" + nome);
		System.out.println("idade:" + idade + "anos");
		System.out.println("altura:" + altura + "m");
	}
}

package Atividades_AnaJulia_Oliveira;

public class Visitante {
	private String nome;
	private int idade;
	private double altura;
	String trocarNome;
	int trocarIdade;
	double trocarAltura;
	
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
	public boolean getPodeAndarNoBrinquedo(int idade, double altura) {
        if (idade >= 10 && altura >= 1.5) {
        	return true;
        }else {
            return false;
        }
     }
}

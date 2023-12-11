package Atividades_AnaJulia_Oliveira;

public class Brinquedo2 {
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	public Brinquedo2 (String nome, double alturaMinima, int capacidadeMaxima) {
		this.nome = nome;
		this.alturaMinima = alturaMinima;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima (double altura) {
		this.alturaMinima = altura;
	}
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidade) {
		this.capacidadeMaxima = capacidade;
	}
	public void exibirInfo() {
	System.out.println("brinquedo:" + nome);
    System.out.println("altura minima:" + alturaMinima);
    System.out.println("capacidade maxima" + capacidadeMaxima);
	}
}

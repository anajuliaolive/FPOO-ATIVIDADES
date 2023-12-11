package Aula06_09;

public class Casa {
	//atributos
	private String cor;
	private float preco;
	private float metragem;
	private int qntComodo;
	private int numeroCamas;

	//construtor padrão
	public Casa() {
				
	}
	//contrutor com parâmetros
	public Casa (String cor, float preco, float metragem, int qntComodo ) {
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.qntComodo = qntComodo;
	}
	//metodos stt gtt
	public String getCor() {
		return cor; 
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco; 
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return metragem; 
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	public int getQntComodo() {
		return qntComodo;
	}
	public void setQntComodo(int qntComodo) {
		this.qntComodo = qntComodo;
	}
	//metodos 
	public void mostrarDetalhes() {
		System.out.println("cor" + cor);
		System.out.println("preco" + preco);
		System.out.println("metragem" + metragem);
	}
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	

}

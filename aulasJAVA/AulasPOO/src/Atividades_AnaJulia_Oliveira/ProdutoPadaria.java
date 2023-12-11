package Atividades_AnaJulia_Oliveira;

public class ProdutoPadaria implements Produto {
	//atributos 
	private String nome;
	private double preco;
	
	//construtor padrão
	public ProdutoPadaria() {
	}

	//construtor com parametros
	public ProdutoPadaria(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String getNome() {
		return nome; 
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public double getPreco() {
		return preco;
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void exibir(String nome, double preco) {
		System.out.println("nome:" + nome + "\npreco:" + preco);	
	}
}

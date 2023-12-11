package Aula_2308;

public class Cachorro extends Animal1 {
	//metodo construtor
	public Cachorro(String nome) {
		super(nome);//pegando atributo nome da super classe animal1
	}
	@Override //sobrescria de metodo
	public void emitirSom() {
		System.out.println("o cachorro esta latindo...");
	}
}

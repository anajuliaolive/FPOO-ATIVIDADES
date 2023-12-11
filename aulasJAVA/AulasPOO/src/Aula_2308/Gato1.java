package Aula_2308;

public class Gato1 extends Animal1 {
	//metodo construtor
	public Gato1(String nome) {
		super(nome);
	}
	@Override //sobrescria de metodo
	public void emitirSom() {
		System.out.println("o gato esta emitindo miando...");
	}
	
	

}

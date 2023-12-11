package Aula_2308;

public class Gato extends Animal{//herança (extends)
	//atributos
	public String raca;
	public float peso;
	public int idade;
	
	//construtor
	public Gato() {
		super();
		System.out.println("acabei de nascer e sou um gato" + "sem caracteristicas");
	}
	public Gato(String raca) {//met.construtor com parametros
		super();
		this.raca = raca;
		System.out.println(" acabei de nascer e sou um gato" + "da raca" + this.raca);
	}
	public Gato(float peso, int idade) {
		super();
		this.peso = peso;
		this.idade = idade;
		System.out.println(" acabei de nascer e sou um gato" + "com" + this.peso + "kg" + "e" + this.idade + "anos" + "de idade");
	}
	//metodos
	public void som() {
		super.som(); //som da classe animal
		System.out.println("som da classe Gato");
	}
	

}

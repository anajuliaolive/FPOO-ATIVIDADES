package Aula_2308;

public class Animal { //classe pai ou super classe
	//atributos
	public String nome = "Frajola";
	
	//metodo construtor
	public Animal () {
		super();
		System.out.println("OBEJTO animal acabou de nascer");
	}
	//metodos
	public void som() {
		System.out.println("\n som da classe Animal");
	}
	public void brincar() {
		System.out.println("\n brincando...");
	}
	public void som1() {
		System.out.println("\n som1 da classe Animal");
	}

}//fim classe

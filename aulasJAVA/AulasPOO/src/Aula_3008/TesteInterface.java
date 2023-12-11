package Aula_3008;

public class TesteInterface {

	public static void main(String[] args) {
		//instancia de objetos
		//nao posso instanciar onj de interface, e sim de classes!!
		InterfacePai obj = new UsoInterface();
		obj.metodo1();
		obj.metodo2();
		obj.somar(5, 10);

	}

}

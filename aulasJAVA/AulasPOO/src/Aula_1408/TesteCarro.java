package Aula_1408;

public class TesteCarro {

	public static void main(String[] args) {
		//instanciando objetos da classe carro
		Carro c1 = new Carro();
		//instancia do carro c1
		c1.modelo = "GOL G5";
		System.out.println("o modelo e: " + c1.modelo);
		System.out.println("a potencia e: " + c1.getPotencia() + "Cavalos");
		c1.setPotencia(1000);
		c1.isParado();
		System.out.println("estado do carro esta parado? " + c1.isParado());
		c1.setParado(true);
		System.out.println("pisando no freio " + c1.setFrear());
		
		//instancia do carro c2
		Carro c2 = new Carro();
		
		//instancia do carro c3
		Carro c3 = new Carro("lancer:", 2.0f);
		System.out.println("carro 3" + c3.getPotencia());
	}

}
 
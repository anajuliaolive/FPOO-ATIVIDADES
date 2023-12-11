package Aula_2308;

public class TesteAnimal {

	public static void main(String[] args) {
		//instanciar o objeto da classe Animal
		System.out.println("---------INICIO ANIMAL ---------");
		Animal ani1 = new Animal();
		ani1.nome = "Pica Pau";
		System.out.println("Animal criado:" + ani1.nome);
		
		//instancia de objetos da classe gato
		System.out.println("----------FIM ANIMAL------------");
		
		System.out.println("---------INICIO GATO 1 ---------");
		Gato gato1 = new Gato();
		gato1.nome = "theo";
		System.out.println("Nome:" + gato1.nome);
		gato1.brincar();
		System.out.println("----------FIM 1------------");
		
		System.out.println("---------INICIO GATO 2 ---------");
		Gato gato2 = new Gato("Persa");
		gato2.som();
		
		System.out.println("--------- FIM GATO 2 --------");
		
		System.out.println("---------INICIO GATO 3 ---------");
		Gato gato3 = new Gato(2.5f, 1);

	}

}

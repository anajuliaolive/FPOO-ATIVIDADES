package Aula_0409;

public class TesteCachorro {

	public static void main(String[] args) {
    //instanciando obj
    Cachorro c1 = new Cachorro ("alf", 6, 'F', 5);
    Cachorro c2 = new Cachorro("laila", 2, 'F', 5);
    Cachorro c3 = new Cachorro("maya", 7, 'F', 5);
    Cachorro c4 = new Cachorro("floquino", 5, 'm', 5);
    System.out.print("Cachorro um: " + c1.getNome());
    c1.brincar();
    System.out.print("Cachorro dois: "+ c2.getNome());
    c2.correr();
    System.out.print("Cachorro tres: "+ c3.getNome());
    c3.dormir();
    System.out.print("Cachorro quatro: "+ c4.getNome());
    c4.latir();
	}

}

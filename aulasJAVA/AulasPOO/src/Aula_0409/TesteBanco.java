package Aula_0409;

public class TesteBanco {

	public static void main(String[] args) {
		//instancia de objetos
		Banco b1 = new Banco ("BB");
		Empregado e1 = new Empregado ("Ana");
		System.out.println("O" + e1.getNome() + "e empregado do" + b1.getNome());

	}

}

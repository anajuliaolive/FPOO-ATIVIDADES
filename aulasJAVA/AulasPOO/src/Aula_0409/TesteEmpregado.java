package Aula_0409;

public class TesteEmpregado {

	public static void main(String[] args) {
		//instancia de objetos
		Pessoa p1 = new Pessoa ("gerente", "tia leila", 55);
		Empregado2 e1 = new Empregado2 ();
		Empregado2 e2 = new Empregado2 (1500, p1);//empregado é um tipo de pessoa
		System.out.println("cargo:" + p1.cargo);
		System.out.println("salario:" + e2.getSalario());
	}

}

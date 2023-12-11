package Aula_0409;

public class Empregado2 {
	
	//atributos
	private int salario;
	private Pessoa funcionario; //composição muda o tipo de atributo
	
	//construtor padrao
	public Empregado2() {	
	}
	
	//construtor com parametro
	public Empregado2(int salario, Pessoa funcionario) {
		this.salario = salario;
		this.funcionario = funcionario;
	}
	
	//metodos
	public void setSalario (int salario) {
		this.salario = salario;
	}
	public int getSalario () {
		return salario;
	}
	public void setFuncionario (Pessoa funcionario) {
		this.funcionario = funcionario;
	}
	public Pessoa getFuncionario () {
		return funcionario;
	}
}

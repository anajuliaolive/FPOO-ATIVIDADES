package Aula_2108;

public class Professor extends Pessoa{
	//atributos
	private String nomeCurso;
	private float salario;
	
	//metodo construtor
	public Professor() {
	}
	public Professor(String nc, float sa) {
		super();
		this.nomeCurso = nc;
		this.salario = sa;
	}

	public void setNomeCurso (String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getNomeCurso () {
		return nomeCurso;
	}
	public void setSalario (Float salario) {
		this.salario = salario;
	}
	public Float getSalario () {
		return salario;
	}
}

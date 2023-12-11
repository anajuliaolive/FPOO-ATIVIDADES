package Aula_2108;

public class Aluno extends Pessoa{
	//atributos
	private String curso;
	private float nota1; 
	private float nota2;
	public int media;
	public boolean situacaoFinal;

	//metodo construtor
	public Aluno() {
	}
	public Aluno (float nota1 , float nota2) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setNota1(float nota) {
		System.out.println("digite sua primeira nota:");
		nota1 = entrada.nextFloat();
		this.nota1 = nota;
	}
	public Float getNota1() {
		return nota1;
	}
	public void setNota2(float nota2) {
		System.out.println("digite sua segunda nota:");
		nota1 = entrada.nextFloat();
		this.nota2 = nota2;
	}
	public Float getNota2() {
		return nota2;
	}
	public boolean situacaoFinal() {
		if(media >=07) {
			System.out.println("voce foi aprovado");
			media = entrada.nextInt();
			return true;
		}else {
			if(media <= 6)
			System.out.println("voce foi reprovado");
			media = entrada.nextInt();
			return false;
		}
	}
}

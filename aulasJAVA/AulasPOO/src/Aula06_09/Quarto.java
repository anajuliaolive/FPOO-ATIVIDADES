package Aula06_09;

public class Quarto extends Comodo{
	//atributos 
	private int numeroCamas;
	//construtor padrão
	public Quarto() {
			
	}
	//contrutor com parâmetros
	public Quarto (int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	//metodos
	public void getNumeroCamas() { //return type
			
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
		System.out.println("quantidade de camas" + numeroCamas);
	}
	

}

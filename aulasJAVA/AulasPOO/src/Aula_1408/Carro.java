package Aula_1408;

public class Carro {
    //atributos
	public String modelo;
	public float potencia;
	public boolean parado;
	//construtor padrão (default)
	public Carro (){
		System.out.println("default");
	}
	public Carro(String mod, float pot) {
		this.modelo = mod;
		this.potencia = pot;	
	}
	//métodos getters e setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float p) {
		this.potencia = p;
	}
	
	// métodos especiais
	public boolean getAcelerar() {
		if (parado == true) {
			System.out.println("sem movimento!");
		}else {
			System.out.println("em movimento");
		}
		return parado;
	}
	
	public boolean setFrear() {
		if(parado == true) {
			System.out.println("parado...acionei o freio");	
		}else {
			System.out.println("em movimento...socorro!");
		}
		return parado;
	}
	public boolean isParado() { //testa o estado em que o carro se encotra
		return parado;
	}
	public void setParado(boolean pa) { //muda o estado do carro
		parado = pa;
	}
}

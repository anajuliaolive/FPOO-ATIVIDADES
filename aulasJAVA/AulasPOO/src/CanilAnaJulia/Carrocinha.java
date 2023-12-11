package CanilAnaJulia;

public class Carrocinha {
	private String modelo;
	int i;
	public Carrocinha() {
		
	}

	public Carrocinha(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public void resgatarCachorro() {
		if(i>=1) {
			System.out.println("você resgatou o cachorro!");
		}else {
			System.out.println("o cachorro foi pego!");
		}
	}

}

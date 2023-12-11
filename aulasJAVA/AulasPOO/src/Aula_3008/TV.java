package Aula_3008;

public class TV implements ControleRemoto {

	@Override
	public void ligar() {
		System.out.println("ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("desligando...");
	}

	@Override
	public void volumeMais(int vol) {
		vol = vol + 1;
		System.out.println("aumentando volume:" + vol);
	}

	@Override
	public void volumeMenos(int vol) {
		vol = vol - 1;
		System.out.println("diminuindo volume" + vol);
	}

	@Override
	public int getPolegadas() {
		return 65;
	}

}

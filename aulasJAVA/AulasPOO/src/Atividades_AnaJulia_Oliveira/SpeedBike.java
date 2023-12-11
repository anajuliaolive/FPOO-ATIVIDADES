package Atividades_AnaJulia_Oliveira;

public class SpeedBike implements InterfaceVeiculo {
	//atributos
	public int velocidade;
	public int marcha;
	
	//construtor padrao
	public SpeedBike() {
	}
	
	public SpeedBike(int velocidade, int marcha) {
		this.velocidade =  velocidade;
		this.marcha = marcha;
	}
	//getters e setters
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	@Override
	public int mudarMarcha() {
		marcha = marcha +1;
		System.out.println("voce mudou de marcha!");
		return marcha;
	}

	@Override
	public void acelerar() {
	}
	@Override
	public void frear() {
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getIdade() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void mudarMarcha(int mar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar(int acer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frear(int frear) {
		// TODO Auto-generated method stub
		
	}

}

package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class MountainBike implements InterfaceVeiculo{
	Scanner entrada = new Scanner(System.in);
	public int velocidade;
	public int marcha;
	
	//construtor padrao
	public MountainBike() {
	}
	
	//construtor com parametros
	public MountainBike(int velocidade, int marcha) {
	
	}
	public void estado() {
	}

	@Override
	public int mudarMarcha() {
		return marcha;
	}

	@Override
	public void acelerar() {
		System.out.println("digite a velocidade:");
		int velocidade = + 5;
	}

	@Override
	public void frear() {
		int frear = -5;
	}

	@Override
    public void mudarMarcha(int mar) {
         mar = mar +0;
         System.out.println("mudando a marcha" + mar );

	}
    @Override
    public void acelerar(int acer) {
         acer = acer +1;
         System.out.println("acelerando" + acer);
	}
    @Override
    public void frear (int frear) {
        frear = frear - 1 ;
        System.out.println("freiando" + frear);
     }
     //metodo da classe
     public void estado (int v, int m,int acer,int fer  ) {
        System.out.println("\n acelerando: "+ acer + "\n marcha: "+m +"\n freiando: "+ fer+"\n velocidade: "+ v);
   }
}
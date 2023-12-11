package Atividades_AnaJulia_Oliveira;

public class Academia {
	//atributos
		public String nome;
		public double cpf;
		public double telefone;
		public int idade;
		public float altura;
		public float peso;
		public float imc;
		public float desejavel;
		public float setImc() {
			
			if (peso / (altura * altura) <= 18.5) {
				System.out.println("magreza");
			} else if (peso / (altura * altura) >= 18.5 && peso / (altura * altura) <= 24.9) {
			System.out.println("normal");
		} else if (peso / (altura * altura) >= 25 && peso / (altura * altura) <= 29.9) {
			System.out.println("sobrepeso");
		}
			return imc;
		}
		public float setDesejavel() {
			if(desejavel > 0) {
				float resu = (peso - desejavel);
				System.out.println("diferença para peso desejavel" + resu);
				return peso - desejavel;
			}else 
			return peso - desejavel;
		}
}

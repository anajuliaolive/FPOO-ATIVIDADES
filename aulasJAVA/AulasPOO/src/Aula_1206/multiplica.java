package Aula_1206;

import javax.swing.JOptionPane;

public class multiplica { //nome da classe é multiplica
		public static void main(String []args) {
		String primeiroNumero;
		String segundoNumero;
		
		float numero1;
		float numero2;
		float multiplicacao;
		
		primeiroNumero = JOptionPane.showInputDialog("Entre com o 1º numero:");
		segundoNumero = JOptionPane.showInputDialog("Entre com o 2º numero:");
		// conversão de tipos (parse)
		numero1 = Float.parseFloat(primeiroNumero);
		numero2 = Float.parseFloat(segundoNumero);
		multiplicacao = numero1 * numero2;
	
		JOptionPane.showMessageDialog(null,"A soma e" + multiplicacao, "Resultado da multiplicacao:" , JOptionPane.PLAIN_MESSAGE);
		System.out.println("A multiplicacao e:" + multiplicacao);  
	}	
}


package Aula_1206;

import javax.swing.JOptionPane;

public class Soma { //nome da classe é soma
	public static void main(String []args) {
		String primeiroNumero;
		String segundoNumero;
		
		int numero1;
		int numero2;
		int soma;
		
		primeiroNumero = JOptionPane.showInputDialog("Entre com o 1º numero:");
		segundoNumero = JOptionPane.showInputDialog("Entre com o 2º numero:");
		// conversão de tipos (parse)
		numero1 = Integer.parseInt(primeiroNumero);
		numero2 = Integer.parseInt(segundoNumero);
		soma = numero1 + numero2;
	
		JOptionPane.showMessageDialog(null,"A soma e" + soma, "Resultado da soma:" , JOptionPane.PLAIN_MESSAGE);
		System.out.println("A soma e:" + soma);
	   
	}	
}

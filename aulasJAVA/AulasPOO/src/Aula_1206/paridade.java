package Aula_1206;

import javax.swing.JOptionPane;

public class paridade {

	public static void main(String[] args) {
		int numero=-10;
		if (numero >0) {
			System.out.println("positivo");
			JOptionPane.showMessageDialog(null,"positivo");
		}
		else if (numero <0) {
			System.out.println("negativo");
			JOptionPane.showMessageDialog(null,"negativo");
		}
		else {
			System.out.println("zero");
			JOptionPane.showMessageDialog(null,"zero");
		}

	}

}

/*
mod = % (resto da div por 2)
 and = &&
 or = ||
 not = ~ */
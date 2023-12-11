package Aula_1206;

import javax.swing.JOptionPane;

public class ifElce {

	public static void main(String[] args) {
		String anos;
		
		int idade;
		anos = JOptionPane.showInputDialog("coloque sua idade");
		idade = Integer.parseInt(anos);
		if (idade <=15); {
			System.out.println("nao podera votar");
			JOptionPane.showMessageDialog(null,"nao podera votar");
		}
		if (idade >= 16 && idade <= 18) {
			System.out.println("podera votar");
			JOptionPane.showMessageDialog(null,"podera votar");
		}
		else if (idade >=19) {
			System.out.println("tem a obrigacao de votar");
			JOptionPane.showMessageDialog(null,"tem a obrigacao de votar");
		}
	}
}
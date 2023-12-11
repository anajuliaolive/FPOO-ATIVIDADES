package Aula_1206;

import javax.swing.JOptionPane;

public class Cardapio {

	public static void main(String[] args) {
		int opcao =1;
		switch (opcao) {
		case (1):
			System.out.println("lanche");
		    JOptionPane.showMessageDialog(null,"lanche");
			break;
			
		case (2):
			System.out.println("bebida");
		    JOptionPane.showMessageDialog(null,"bebida");
			break;
			
		case (3):
			System.out.println("sobremesa");
		    JOptionPane.showMessageDialog(null,"sobremesa");
			break;
			
		default:
			System.out.println("nenhuma opcao valida!");
		    JOptionPane.showMessageDialog(null,"nenhuma opcao valida!");
			break;
	}
}

}

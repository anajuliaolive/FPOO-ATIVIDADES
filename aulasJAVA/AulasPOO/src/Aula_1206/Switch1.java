package Aula_1206;

import javax.swing.JOptionPane;

public class Switch1 {

	public static void main(String[] args) {
			int idade = 70;
			switch (idade) {
			case (10):
				System.out.println("menor de idade");
			    JOptionPane.showMessageDialog(null,"menor de idade");
				break;
				
			case (18):
				System.out.println("maior de idade");
			    JOptionPane.showMessageDialog(null,"maior de idade");
				break;
	
			case (70):
				System.out.println("experiente!");
			    JOptionPane.showMessageDialog(null,"experiente!");
				break;
				
			default:
				System.out.println("nenhuma idade valida!");
			    JOptionPane.showMessageDialog(null,"nenhuma idade valida!");
				break;
		}
	}

}

package Aula_1206;

import javax.swing.JOptionPane;

public class Switch2 {
	public enum dias {dom, seg, ter}
	
	
	public static void main (String[] args) {
		dias [] diasHoje = dias.values();
		for(dias agora : diasHoje) { //foreach usado pra listas!
			switch (agora) {
			case dom:
				System.out.println("domingo");
				JOptionPane.showMessageDialog(null,"domingo");
				break;
            case seg:
            	System.out.println("segunda");
				JOptionPane.showMessageDialog(null,"segunda");
				break;
            case ter:
            	System.out.println("terca");
				JOptionPane.showMessageDialog(null,"terca");
	            break;

			default:
				System.out.println("dias nao validos");
				JOptionPane.showMessageDialog(null,"dias nao validos");
				break;
			}
		}

	}

}

package Aula_1206;

public class Relógio {

	public static void main(String[] args) {
		int R = 50;
		int F = 100;
		int C = 95;
		
		if (F > R*3 || C < 95) {
			System.out.println("diminuir o ritimo");
		} else if (F < R*2 && C < 97) {
			System.out.println("aumentar o ritimo");
		}else {
			System.out.println("manter o ritimo");
		}
	}
}

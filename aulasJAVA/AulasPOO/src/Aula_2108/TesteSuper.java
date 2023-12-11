package Aula_2108;

public class TesteSuper {

	public static void main(String[] args) {
		//instanciar objetos das 2 classes
		SuperClasse sc = new SuperClasse();
		SubClasse sb = new SubClasse();
		
		sb.a = 05;
		sb.b = 10;
		sb.c = 15;
		sb.d = 20;
		
		System.out.println(sb.toString());
		System.out.println(sb.a);
		System.out.println(sb.b);
		System.out.println(sb.c);
		System.out.println(sb.d);
		//objeto da SuperClasse
		System.out.println(sc.a);
		System.out.println(sc.b);
		

	}

}

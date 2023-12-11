package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Album {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero total de figurinhas");
		int n = entrada.nextInt(); //quantidade de espaços no album
		int m = entrada.nextInt(); // quandtidade de fig. compradas
		// dica!! utilize uma variavel booleana p/ verificar se em ou nao a figurinha
		Boolean[] tenho = new Boolean[n]; // true ou false
		int x = 0;
		// varrendo o vetor
		for (int i = 0; i < n; i++)
			tenho [i] = false;
		// fig. que ja temos!!
		for (int i = 0; i < m; i++) {
			x = entrada.nextInt();
			tenho[x] = true;
		}
		int repetidas = 0;
		// vamos marcar as repetidas
		for (int i = 0; i < n; i++)
		     if(tenho [i])
			    repetidas ++; //ou...repetidas++
		//vamos contar a quant de fig. repetidas
		     System.out.println("Quantidade de fig. repetidas =" + (n - repetidas));
		     System.out.println("Tamanho do album =" + n);
		     System.out.println("Quantidade de fig. =" + m );
		     
	}
}

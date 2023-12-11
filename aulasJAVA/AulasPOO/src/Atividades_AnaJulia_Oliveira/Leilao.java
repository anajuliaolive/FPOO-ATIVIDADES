package Atividades_AnaJulia_Oliveira;

import java.util.Scanner;

public class Leilao {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número de lances recebidos:");
        int N = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após o número de lances

        String nomeVencedor = "";
        int maiorLance = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            System.out.println("Lance" + (i + 1) + ":");
            String nome = input.nextLine();
            int lance = input.nextInt();
            input.nextLine(); // Consumir a quebra de linha após o valor do lance

            if (lance > maiorLance || (lance == maiorLance && i == 0)) {
                nomeVencedor = nome;
                maiorLance = lance;
            }
        }

        System.out.println("Vencedor: " + nomeVencedor);
        System.out.println("Valor do lance vencedor: " + maiorLance);
        input.close();
    }
}


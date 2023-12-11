package Aula_2108;

import java.util.Scanner;

public class TestePessoaAlunoProfessor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float media;
		
		Aluno alu1 = new Aluno ();
		alu1.setNome(null);
		alu1.setCelular(0);
		alu1.setCpf(0);
		alu1.setCurso(null);
		alu1.setEndereco(null);
		alu1.setTelefone(0);
		alu1.setNota1(0);
		alu1.setNota2(0);
		media = (alu1.getNota1() + alu1.getNota2() /2);
		System.out.println("sua media e:" + media);

    }
}
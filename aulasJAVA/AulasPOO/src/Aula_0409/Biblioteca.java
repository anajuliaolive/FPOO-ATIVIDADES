package Aula_0409;

import java.util.List;

public class Biblioteca {
	//atributos
	private List<Livro> livros; //varios livros
	
	//construtor padrao
	public Biblioteca() {
		
	}
	public Biblioteca(List<Livro> livros) {
		this.livros = livros;
	}
	public List<Livro> getTotallivrosBiblioteca(){
		return livros;
	}

}

package Aula_0409;

import java.util.ArrayList;
import java.util.List;
public class TesteBiblioteca {

	public static void main(String[] args) {
		//instancia de objetos, mas qaul??
		Livro l1 = new Livro ("Programacao JAVA", "Deitel");
		Livro l2 = new Livro ("UML", "Bezerra");
		//instancia da lista vazia
		List<Livro> lista_livro = new ArrayList<Livro>();
		//adicionando obj livro no obj lista_livro
		lista_livro.add(l1);
		lista_livro.add(l2);
		//quer ler os livros que estao na lista
		for (Livro ver_lista : lista_livro) {
			System.out.println("livros na lista:" + ver_lista.titulo + ver_lista.autor);
		}
		//instanciar a biblioteca
		Biblioteca bib = new Biblioteca(lista_livro);
		List<Livro> li = bib.getTotallivrosBiblioteca();
		for (Livro livr : li) {
			System.out.println("Titulo:" + livr.titulo + "autor:" + livr.autor);
		}
	} 

}

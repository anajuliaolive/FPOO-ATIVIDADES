package Aula_0409;

public class Livro {
	//atributos
	public String titulo;
	public String autor;
	
	//construtor padrao
	public Livro() {
	}
	//construtor com parametros
	public Livro(String titulo, String autor) {
		this.titulo= titulo;
		this.autor = autor;
	}
	public void setTitulo(String titulo) {
		this.titulo= titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor(String autor) {
		this.autor= autor;
	}
	public String getAutor() {
		return autor;
	}

}

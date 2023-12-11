package Aula_0409;

import java.util.List;

public class Faculdade {
	//atributos
	public String nomeFacul;
	private List<Turma> cursos;
	
	//construtor padrao
	public Faculdade() {
	}
	//construtor com parametros
	public Faculdade(String nomeFacul,List<Turma> cursos) {
		this.nomeFacul = nomeFacul;
		this.cursos = cursos;
	}
	//metodos
	public void setNomeFacul(String nomeFacul) {
		this.nomeFacul = nomeFacul;
	}
	public String getNomeFacul() {
		return nomeFacul;
	}
	public void setCursos(List<Turma> cursos) {
		this.cursos = cursos;
	}
	public List<Turma> getCursos() {
		return cursos;
	}
	//metodo para pegar o total de esudantes
	public int getTotalesudantes () {
		int nEstudantes = 0;
		List<Estudante> estudante;
		for(Turma cur : cursos) {
			estudante = cur.getEstudantes();
			for(Estudante s : estudante) {
				nEstudantes++;
			}
		}
		return nEstudantes;
	}

}

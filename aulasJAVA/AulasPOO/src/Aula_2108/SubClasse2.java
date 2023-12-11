package Aula_2108;

public class SubClasse2 extends SubClasse1  {
	public String nome2; //nome desta classe!
	//metodo construtor
	public SubClasse2 () {
		System.out.println("senha vista pela SubClasse2" + senha);
		System.out.println("nome visto pela SucClasse2" + nome);
	}
	public String getNome() {
		return nome2;
	}
	public void setNome (String nome2) {
		this.nome2 = nome2;
	}
}

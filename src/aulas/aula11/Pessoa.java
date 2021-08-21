package aulas.aula11;

//Heran�a part. 2
//Superclasse

/*
 * abstract class = n�o pode ser instanciada;
 * abstract method = n�o pode ser implementado, apenas sobrescrito;
 * final class = n�o pode ser herdada, ou seja, n�o pode ter subclasses;
 * final method = n�o pode ser sobrescrito;
*/

public abstract class Pessoa {

	private String nome;
	private Integer idade;
	private String sexo;
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo;
	}

	public final void fazerAniv() {
		System.out.println(this.nome + " fez anivers�rio!");
		this.idade++;
	}
	
}

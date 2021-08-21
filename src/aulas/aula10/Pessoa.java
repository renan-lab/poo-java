package aulas.aula10;

//Herança
//Superclasse

public class Pessoa {

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

	public void fazerAniv() {
		System.out.println(this.nome + " fez aniversário!");
		this.idade++;
	}
	
}

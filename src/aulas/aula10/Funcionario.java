package aulas.aula10;

//Subclasse

public class Funcionario extends Pessoa {

	private String setor;
	private boolean trabalhando;
	
	public Funcionario() {
		
	}
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", setor=" + setor + ", trabalhando=" + trabalhando + "]";
	}

	public void mudarTrabalho(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
}

package aulas.aula11;

//Subclasse

public class Professor extends Pessoa {

	private String especialidade;
	private double salario;
	
	public Professor() {
		
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", especialidade=" + especialidade + ", salario=" + salario + "]";
	}

	public void receberAum(double vlr) {
		System.out.println(super.getNome() + " recebeu um aumento de R$" + vlr);
		this.salario += vlr;
	}
	
}

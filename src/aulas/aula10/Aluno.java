package aulas.aula10;

//Subclasse

public class Aluno extends Pessoa {

	private Integer matr;
	private String curso;
	
	public Aluno() {
		
	}
	
	public Integer getMatr() {
		return matr;
	}
	public void setMatr(Integer matr) {
		this.matr = matr;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", matr=" + matr + ", curso=" + curso + "]";
	}

	public void cancelarMatr() {
		if (this.matr != null) {
			System.out.println("A matrícula do(a) " + this.getNome() + " foi cancelada.");
			this.matr = null;
		} else {
			System.out.println(super.getNome() + " não é matriculado(a).");
		}
	}
	
}

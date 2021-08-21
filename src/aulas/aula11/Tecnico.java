package aulas.aula11;

public class Tecnico extends Aluno {

	private Integer registroProfissional;
	
	public Tecnico() {
		
	}

	public Integer getRegistroProfissional() {
		return registroProfissional;
	}
	public void setRegistroProfissional(Integer registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	public void praticar() {
		System.out.println(super.getNome() + " está praticando.");
	}
	
}

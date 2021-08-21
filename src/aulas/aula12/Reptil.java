package aulas.aula12;

public class Reptil extends Animal {

	private String corEscama;
	
	public Reptil() {
		
	}

	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo insetos");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de r�ptil");
	}
	
}

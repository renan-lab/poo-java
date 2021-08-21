package aulas.aula11;

public class Bolsista extends Aluno {

	private double bolsa;

	public Bolsista() {
		
	}
	
	public double getBolsa() {
		return bolsa;
	}
	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public void pagarMensalidade() {
		System.out.println(super.getNome() + " é bolsista, pagamento facilitado!");
	}
	
	public void renovarBolsa() {
		System.out.println("A bolsa do(a) aluno(a) " + super.getNome() + " foi renovada.");
	}
	
}

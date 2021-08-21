package exercicios.aula02;

public class Passaro {

	String especie;
	String cor;
	String comportamento;
	double tamanho;
	
	void Status() {
		System.out.println("Esp�cie: " + this.especie + "\n"
				+ "Cor: " + this.cor + "\n"
				+ "Comportamento: " + this.comportamento + "\n"
				+ "Tamanho (cm): " + this.tamanho);
	}
	
	void Voar() {
		System.out.println("Voou");
	}
	
	void Acariciar() {
		if (this.comportamento.toLowerCase() == "agressivo") {
			System.out.println("N�o � poss�vel acariciar. Comportamento agressivo");
		} else {
			System.out.println("Acariciando...");
		}
	}
	
	void Alimentar() {
		System.out.println("Alimentando...");
	}
	
}

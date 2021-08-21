package aulas.aula03;

//Visibilidade de Atributos e M�todos
/* 

 * public = todos tem acesso.
 * private = somente a classe onde o atributo/m�todo foi declarado tem acesso.
 * protected = somente a classem onde o atributo/m�todo foi declarado e suas sub-classes tem acesso.

*/
public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada) {
			System.out.println("ERRO! N�o � poss�vel rabiscar");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
	
}

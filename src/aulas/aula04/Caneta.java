package aulas.aula04;

//Métodos Getters, Setters e Constructor

public class Caneta {

	private String modelo;
	private String cor;
	private double ponta;
	private boolean tampada;
	
	public Caneta(String modelo, String cor, double ponta) {  //Constructor
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampada = true;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	@Override
	public String toString() {
		return "SOBRE A CANETA:\n"
				+ "Modelo: " + this.modelo + "\n"
				+ "Ponta: " + this.ponta + "\n"
				+ "Cor: " + this.cor + "\n"
				+ "Tampada: " + this.tampada;
	}
	
}

package exercicios.aula05;

public class ContaBanco {

	public Integer numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.status = false;
		this.saldo = 0;
	}
	
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String tipo) {
		if (tipo.toUpperCase() == "CC") {
			this.saldo = 50;
			this.tipo = tipo;
			this.status = true;
		} else if (tipo.toUpperCase() == "CP") {
			this.saldo = 150;
			this.tipo = tipo;
			this.status = true;
		} else {
			System.out.println("Tipo de conta inexistente");
		}
	}
	
	public void fecharConta() {
		if (this.saldo > 0 || this.saldo < 0) {
			System.out.println("Impossível fechar conta, há saldo negativo ou positivo");
		} else {
			this.status = false;
		}
	}
	
	public void depositar(double vlr) {
		if (this.status) {
			this.saldo += vlr;
		} else {
			System.out.println("Impossível realizar depósito, a conta está fechada");
		}
	}
	
	public void sacar(double vlr) {
		if (this.status && vlr <= this.saldo) {
			this.saldo -= vlr;
		} else {
			System.out.println("Impossível realizar saque, a conta está fechada ou o valor do saque é maior que o saldo");
		}
	}
	
	public void pagarMensal() {
		if (this.tipo == "cc") {
			this.saldo -= 12;
		} else {
			this.saldo -= 20;
		}
	}
	
	public String toString() {
		return "SOBRE A CONTA:\n"
				+ "Número: " + this.numConta + "\n"
				+ "Tipo: " + this.tipo + "\n"
				+ "Dono: " + this.dono + "\n"
				+ "Saldo: R$" + this.saldo + "\n"
				+ "Status: " + this.status;
	}
	
}

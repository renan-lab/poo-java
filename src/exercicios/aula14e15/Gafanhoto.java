package exercicios.aula14e15;

public class Gafanhoto extends Pessoa {
	
	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	@Override
	public String toString() {
		return "Gafanhoto {" + super.toString() + ", login=" + login + ", totAssistido=" + totAssistido + "]}";
	}
	
}

package aulas.aula08;

public class Lutador {

	private String nome, nacionalidade, categoria;
	private Integer idade;
	private double altura, peso;
	private int vitorias, derrotas, empates;
	
	public Lutador(String nome, String nacionalidade, Integer idade, double altura, double peso, int vitorias,
			int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void apresentar() {
		System.out.println("Lutador: " + this.nome);
		System.out.println("Origem: " + this.nacionalidade);
		System.out.println(this.idade + " anos");
		System.out.println(this.altura + " m de altura");
		System.out.println("Pesando: " + this.peso + "Kg");
		System.out.println("Ganhou: " + this.vitorias);
		System.out.println("Perdeu: " + this.derrotas);
		System.out.println("Empatou: " + this.empates);
	}
	
	public void status() {
		System.out.println("----- STATUS -----");
		System.out.println(this.nome + " é um peso " + this.categoria);
		System.out.println(this.vitorias + " vitórias");
		System.out.println(this.derrotas + " derrotas");
		System.out.println(this.empates + " empates");
	}
	
	public void ganharLuta() {
		this.vitorias++;
	}
	
	public void perderLuta() {
		this.derrotas++;
	}
	
	public void empatarLuta() {
		this.empates++;
	}
	
}

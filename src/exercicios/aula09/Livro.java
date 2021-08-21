package exercicios.aula09;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
		
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public String detalhes() {
		return "----- LIVRO -----\n"
				+ "T�tulo: " + this.titulo + "\n"
				+ "Autor: " + this.autor + "\n"
				+ "Total de p�ginas: " + this.totPaginas + "\n"
				+ "P�gina atual: " + this.pagAtual + "\n"
				+ "Aberto: " + this.aberto + "\n"
				+ "Leitor: " + this.leitor.getNome();
	}

	@Override
	public void abrir() {
		
		if (!this.aberto) {
			this.aberto = true;
		} else {
			System.out.println("O livro '"+ this.titulo +"' j� est� aberto.");
		}
		
	}

	@Override
	public void fechar() {
		if (this.aberto) {
			this.aberto = false;
		} else {
			System.out.println("O livro '" + this.titulo + "' j� est� fechado.");
		}
	}

	@Override
	public void folhear(int p) {
		if (this.aberto && p <= this.totPaginas) {
			this.pagAtual = p;
		} else if (p > this.totPaginas) {
			System.out.println("P�gina maior que o total. (" + this.titulo + ")");
		} else {
			System.out.println("O livro '" + this.titulo + "' n�o est� aberto.");
		}
	}

	@Override
	public void avancarPag() {
		if (this.aberto && this.pagAtual < this.totPaginas) {
			this.pagAtual++;
		} else if (!this.aberto) {
			System.out.println("O livro '" + this.titulo + "' n�o est� aberto.");
		} else {
			System.out.println("N�o h� mais p�ginas. (" + this.titulo + ")");
		}
	}

	@Override
	public void voltarPag() {
		if (this.aberto && this.pagAtual > 0) {
			this.pagAtual--;
		} else {
			System.out.println("Est� na primeira p�gina. (" + this.titulo + ")");
		}
	}
	
}

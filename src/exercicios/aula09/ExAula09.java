package exercicios.aula09;

public class ExAula09 {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22, "M");
		p[1] = new Pessoa("Maria", 25, "F");
		
		l[0] = new Livro("Percy Jackson - O Mar de Monstros", "Rick Riordan", 300, p[0]);
		l[1] = new Livro("Harry Potter e A Ordem da Fênix", "JK Rowling", 500, p[1]);
		l[2] = new Livro("Filhos do Éden - Herdeiros de Atlântida", "Eduardo Spohr", 800, p[0]);
		
		l[0].abrir();
		l[1].abrir();
		l[2].abrir();
		l[0].folhear(300);
		l[1].avancarPag();
		l[1].avancarPag();
		l[1].avancarPag();
		l[1].voltarPag();
		l[2].folhear(799);
		l[2].voltarPag();
		l[2].avancarPag();
		l[2].avancarPag();
		l[2].avancarPag();
		l[1].fechar();
		l[1].folhear(250);
		
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
	}

}

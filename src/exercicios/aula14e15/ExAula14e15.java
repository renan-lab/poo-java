package exercicios.aula14e15;

public class ExAula14e15 {

	public static void main(String[] args) {
		
		Video[] v = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Gafanhoto[] g = new Gafanhoto[2];
		g[0] = new Gafanhoto("Renan", 18, "m", "renan");
		g[1] = new Gafanhoto("Fernanda", 25, "f", "fer");
		
		Visualizacao[] vis = new Visualizacao[5];
		
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0]);
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[1].avaliar(87.0);
		System.out.println(vis[1]);
		
		System.out.println();
		
		System.out.println("VÍDEOS\n----------------------");
		for (Video video : v) {
			System.out.println(video);
		}
		
		System.out.println("\nGAFANHOTOS\n----------------------");
		for(Gafanhoto gafanhoto : g) {
			System.out.println(gafanhoto);
		}
		
	}

}

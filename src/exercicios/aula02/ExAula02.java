package exercicios.aula02;

public class ExAula02 {

	public static void main(String[] args) {
		
		Passaro passaro = new Passaro();
		
		passaro.especie = "calopsita";
		passaro.cor = "padrão";
		passaro.tamanho = 20;
		passaro.comportamento = "agressivo";
		
		passaro.Status();
		passaro.Acariciar();
		passaro.Alimentar();
		
		System.out.println();
		
		Passaro passaro2 = new Passaro();
		
		passaro2.especie = "arara";
		passaro2.cor = "vermelha";
		passaro2.tamanho = 30;
		passaro2.comportamento = "dócil";
		
		passaro2.Status();
		passaro2.Acariciar();

	}

}

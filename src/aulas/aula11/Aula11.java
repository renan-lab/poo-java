package aulas.aula11;

public class Aula11 {

	public static void main(String[] args) {
		
		Aluno p1 = new Aluno();
		Bolsista p2 = new Bolsista();
		Tecnico p3 = new Tecnico();
		
		p1.setNome("Maria");
		p2.setNome("Pedro");
		p3.setNome("Renan");
		
		p1.setSexo("F");
		p1.setIdade(18);
		p1.setMatr(73492);
		p1.setCurso("Informática");
		
		p2.setSexo("M");
		p2.setIdade(20);
		p2.setMatr(78798);
		p2.setCurso("ADM");
		p2.setBolsa(12.5);
		
		p3.setSexo("M");
		p3.setIdade(18);
		p3.setMatr(78965);
		p3.setCurso("DS");
		p3.setRegistroProfissional(98897);
		
		p1.pagarMensalidade();
		p2.pagarMensalidade();
		p3.praticar();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}

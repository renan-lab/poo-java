package aulas.aula10;

public class Aula10 {

	public static void main(String[] args) {
		
		Aluno p1 = new Aluno();
		Professor p2 = new Professor();
		Funcionario p3 = new Funcionario();
		
		p1.setNome("Maria");
		p2.setNome("Cláudio");
		p3.setNome("Fabiana");
		
		p1.setSexo("F");
		p1.setIdade(18);
		p1.setMatr(73492);
		p1.setCurso("Informática");
		
		p2.setSexo("M");
		p2.setIdade(35);
		p2.setEspecialidade("Matemática");
		p2.setSalario(2500.75);
		
		p3.setSexo("F");
		p3.setIdade(27);
		p3.setSetor("Estoque");
		
		p1.cancelarMatr();
		p2.receberAum(400);
		p3.mudarTrabalho(true);
		
		p1.fazerAniv();
		p2.fazerAniv();
		p3.fazerAniv();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}

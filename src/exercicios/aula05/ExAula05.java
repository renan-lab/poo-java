package exercicios.aula05;

public class ExAula05 {

	public static void main(String[] args) {
		
		ContaBanco conta1 = new ContaBanco();

		conta1.abrirConta("CC");
		
		conta1.setDono("Jubileu");
		conta1.setNumConta(214235);
		
		conta1.depositar(300);
		
		ContaBanco conta2 = new ContaBanco();
		
		conta2.abrirConta("CP");
		
		conta2.setDono("Creusa");
		conta2.setNumConta(525235);
		
		conta2.depositar(500);
		
		conta2.sacar(100);
		
		System.out.println(conta1);
		System.out.println("--------------------");
		System.out.println(conta2);
		
	}

}

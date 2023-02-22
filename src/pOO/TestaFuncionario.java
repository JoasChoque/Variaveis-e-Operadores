package pOO;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Rodrigo", 1200.00f, 23, "Encanador", "Infraestrutura");
		Funcionario f2 = new Funcionario("Marcela",2000.0f,34,"Gerente de Venda","Gerência");
		
		f1.visualizar();
		f2.visualizar();

	}

}

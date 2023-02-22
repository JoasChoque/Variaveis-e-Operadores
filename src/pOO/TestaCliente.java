package pOO;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Carlos",23,"Rua x numero 1","Masculino","carlos@gmail.com");
		Cliente c2 = new Cliente("Roberta", 18, "Rua y numero 2","Feminino","roberta@gmail.com");
		
		c1.visualizar();
		c2.visualizar();

	}

}

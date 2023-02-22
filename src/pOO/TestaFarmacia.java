package pOO;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia f1 = new Farmacia("Bifarma","Rua manchester 456", 30,"8h as 17h", "2038-8465");
		
		Farmacia f2 = new Farmacia("Drogamais", "Rua m 6578", 50, "9h as 11h", "7834-2345");
		
		f1.visualizar();
		f2.visualizar();

	}

}

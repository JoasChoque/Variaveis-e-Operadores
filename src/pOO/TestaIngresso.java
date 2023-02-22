package pOO;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso i1 = new Ingresso(170.0f, 456, "Marrom 5","Meia", "22/02/2022");
		
		Ingresso i2 = new Ingresso(450.50f,876,"Bon Jovi","Inteira","21/02/2022");
		
		i1.visualizar();
		i2.visualizar();

	}

}

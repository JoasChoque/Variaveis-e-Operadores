package pOO;

public class TestaGame {

	public static void main(String[] args) {
		Produto j1 = new Produto("Overwatch", 160.0f,"PC","Ação","Digital");
		
		Produto j2 = new Produto("Minecraft",60.0f,"PC/ps4/xbox","Sobrevivência","Física");
		
		j1.visualizar();
		j2.visualizar();

	}

}

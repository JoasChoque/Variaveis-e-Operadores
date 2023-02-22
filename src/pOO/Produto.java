package pOO;

public class Produto {
	private String nomeJogo;
	private float valorJogo;
	private String console;
	private String genero;
	private String midia;
	
	public Produto(String nomeJogo, float valorJogo, String console, String genero, String midia) {
		this.nomeJogo = nomeJogo;
		this.valorJogo = valorJogo;
		this.console = console;
		this.genero = genero;
		this.midia = midia;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public float getValorJogo() {
		return valorJogo;
	}

	public void setValorJogo(float valorJogo) {
		this.valorJogo = valorJogo;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}
	
	public void visualizar() {
		System.out.println("Nome do jogo: "+this.nomeJogo);
		System.out.println("Preço do jogo: "+this.valorJogo);
		System.out.println("Console do jogo: "+this.console);
		System.out.println("Gênero do jogo: "+this.genero);
		System.out.println("Mídia física ou digital? "+this.midia+"\n");
	}
	
}

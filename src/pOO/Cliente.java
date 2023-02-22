package pOO;

public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private String genero;
	private String email;
	
	//construtor
	public Cliente(String nome, int idade, String endereco, String genero, String email) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.genero = genero;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void visualizar() {
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("Idade do cliente: "+this.idade+" anos");
		System.out.println("Endereço do cliente: "+this.endereco);
		System.out.println("Gênero do Cliente: "+this.genero);
		System.out.println("Email do Cliente: "+this.email+"\n");
	}
}

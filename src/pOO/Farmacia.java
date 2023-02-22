package pOO;

public class Farmacia {
	private String nomeFarmacia;
	private String endereco;
	private int qtdFuncionarios;
	private String horario;
	private String telefone;
	
	public Farmacia(String nomeFarmacia, String endereco, int qtdFuncionarios, String horario, String telefone) {
		this.nomeFarmacia = nomeFarmacia;
		this.endereco = endereco;
		this.qtdFuncionarios = qtdFuncionarios;
		this.horario = horario;
		this.telefone = telefone;
	}

	public String getNomeFarmacia() {
		return nomeFarmacia;
	}

	public void setNomeFarmacia(String nomeFarmacia) {
		this.nomeFarmacia = nomeFarmacia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		System.out.println("Nome da farmácia: "+this.nomeFarmacia);
		System.out.println("Endereço: "+this.endereco);
		System.out.println("Quantidade de funcionários: "+this.qtdFuncionarios+" funcionários");
		System.out.println("Horário de funcionamento: "+this.horario);
		System.out.println("Telefone: "+this.telefone+"\n");
	}
	
}

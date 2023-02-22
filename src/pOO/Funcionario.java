package pOO;

public class Funcionario {
	private String nome;
	private float salario;
	private int idade;
	private String cargo;
	private String area;
	
	public Funcionario(String nome, float salario, int idade, String cargo, String area) {
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
		this.cargo = cargo;
		this.area = area;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void visualizar() {
		System.out.println("Nome do funcionário: "+this.nome);
		System.out.println("Salário do funcionario: "+this.salario);
		System.out.println("Idade do funcionário: "+this.idade);
		System.out.println("Cargo do funcionário: "+this.cargo);
		System.out.println("Área de atuação do funcionário: "+this.area+"\n");
	}
}

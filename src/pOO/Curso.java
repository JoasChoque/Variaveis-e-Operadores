package pOO;

public class Curso {
	private String nomeCurso;
	private int qtdAulas;
	private String turma;
	private String horarioAula;
	private String dias;
	
	public Curso(String nomeCurso, int qtdAulas, String turma, String horarioAula, String dias) {
		this.nomeCurso = nomeCurso;
		this.qtdAulas = qtdAulas;
		this.turma = turma;
		this.horarioAula = horarioAula;
		this.dias = dias;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getQtdAulas() {
		return qtdAulas;
	}

	public void setQtdAulas(int qtdAulas) {
		this.qtdAulas = qtdAulas;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getHorarioAula() {
		return horarioAula;
	}

	public void setHorarioAula(String horarioAula) {
		this.horarioAula = horarioAula;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}
	
	public void visualizar() {
		System.out.println("Nome do curso: "+this.nomeCurso);
		System.out.println("Quantidade de aulas: "+this.qtdAulas);
		System.out.println("Turma: "+this.turma);
		System.out.println("Horário das aulas: "+this.horarioAula);
		System.out.println("Dias de aula: "+this.dias+"\n");
	}
}

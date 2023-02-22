package pOO;

public class TestaCurso {

	public static void main(String[] args) {
		Curso c1 = new Curso("Generation", 4, "turma A", "8h as 17h", "Segunda a Sexta");
		
		Curso c2 = new Curso("Udemy", 3, "Turma b", "7h as 13h", "Segunda/Terça/Quarta");
		
		c1.visualizar();
		c2.visualizar();

	}

}

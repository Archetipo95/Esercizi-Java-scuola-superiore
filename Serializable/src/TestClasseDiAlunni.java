

public class TestClasseDiAlunni {
	public static void main(String[] args) {
		ClasseDiAlunni classe = new ClasseDiAlunni();
		classe.aggiungiAlunno(new Alunno("Cog1", "Nom1", 1947));
		classe.aggiungiAlunno(new Alunno("Cog2", "Nom2", 1959));
		classe.aggiungiAlunno(new Alunno("Cog3", "Nom3", 1988));
		System.out.println(classe);
	}
}

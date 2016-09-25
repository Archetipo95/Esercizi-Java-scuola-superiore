

public class TestClasseDiAlunniSerializable {
	public static void main(String[] args) {
		ClasseDiAlunniSerializable classe = new ClasseDiAlunniSerializable();
		classe.aggiungiAlunno(new AlunnoSerializable("Cog1", "Nom1", 1947));
		classe.aggiungiAlunno(new AlunnoSerializable("Cog2", "Nom2", 1959));
		classe.aggiungiAlunno(new AlunnoSerializable("Cog3", "Nom3", 1988));
		System.out.println(classe);
	}
}

import java.util.Vector;


public class ClasseDiAlunni {

	private Vector<Alunno> alunni;
	
	
	/**
	 * 
	 */
	public ClasseDiAlunni() {
		alunni = new Vector<Alunno>(20, 5);
	}

	public int quantiSono()
	{
		return alunni.size();
	}
	
	public void aggiungiAlunno(Alunno al)
	{
		alunni.add(al);
	}

	public void aggiungiAlunno(int pos, Alunno al)
	{
		alunni.add(pos, al);
	}
	
	public Alunno togliAlunno(int pos)
	{
		Alunno al = alunni.remove(pos);
		return al;
	}

	@Override
	public String toString() {
		return "ClasseDiAlunni [alunni=" + alunni + "]";
	}
	
	
	
}

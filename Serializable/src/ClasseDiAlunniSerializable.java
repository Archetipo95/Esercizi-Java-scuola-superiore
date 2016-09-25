
import java.util.Vector;
import java.io.Serializable;


public class ClasseDiAlunniSerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 351043790835095619L;
	
	
	
	
	private Vector<AlunnoSerializable> alunni;
	
	
	/**
	 * 
	 */
	public ClasseDiAlunniSerializable() {
		alunni = new Vector<AlunnoSerializable>(20, 5);
	}

	public int quantiSono()
	{
		return alunni.size();
	}
	
	public void aggiungiAlunno(AlunnoSerializable al)
	{
		alunni.add(al);
	}

	public void aggiungiAlunno(int pos, AlunnoSerializable al)
	{
		alunni.add(pos, al);
	}
	
	public AlunnoSerializable togliAlunno(int pos)
	{
		AlunnoSerializable al = alunni.remove(pos);
		return al;
	}

	@Override
	public String toString() {
		return "ClasseDiAlunni [alunni=" + alunni + "]";
	}
	
	
	
}

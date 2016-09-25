
import java.util.Vector;


public class TestVectorDiAlunni {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// definisco la variabile  classeDiAlunni  di tipo  Vector<Alunno>
		// la scritta  <Alunno>  indica che il Vector conterra' elementi di
		// tipo Alunno o derivati
		Vector<Alunno> classeDiAlunni;
		
		// costruisco  classeDiAlunni  con capacita' iniziale di 20
		// l'incremento  5  e' il numero di posti aggiunti in caso di
		// superamento della capacita'
		classeDiAlunni = new Vector<Alunno>(20, 5);
		
		// inseriamo alcuni alunni
		Alunno santi = new Alunno("Santi", "Paolo", 1899);
		classeDiAlunni.addElement( santi );
		classeDiAlunni.addElement( new Alunno("Mion", "Andrea", 1901) );
		classeDiAlunni.addElement( new Alunno("Laurel", "Stan", 1888) );
		classeDiAlunni.addElement( new Alunno("Hardy", "Oliver", 1876) );
		classeDiAlunni.addElement( new Alunno("Giannino", "Gianni", 1999) );
		
		// stampiamo tutti gli alementi di  classeDiAlunni
		for(int i=0; i<classeDiAlunni.size(); ++i)
		{
			//Alunno stud = classeDiAlunni.elementAt(i);
			//System.out.println("alunno " + i +" = " + stud);
			System.out.println("alunno " + i +" = " + classeDiAlunni.elementAt(i) );
		}
		
		System.out.println("Cancello alunno alla posizione 2");
		classeDiAlunni.removeElementAt(2);

		// stampiamo tutti gli alementi di  classeDiAlunni
		for(int i=0; i<classeDiAlunni.size(); ++i)
		{
			System.out.println("alunno " + i +" = " + classeDiAlunni.elementAt(i) );
		}
		// stampiamo tutti gli anni di nascita di  classeDiAlunni
		for(int i=0; i<classeDiAlunni.size(); ++i)
		{
			System.out.println("alunno " + i +" nato " 
					+ classeDiAlunni.elementAt(i).getAnnoNascita() );
		}
	}

}

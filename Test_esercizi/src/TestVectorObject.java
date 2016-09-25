import java.util.Vector;
public class TestVectorObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();					//inizializzazione vettore
		v.add( new String("qwerty"));							//per aggiungere nuove stringhe nel vettore
		v.add( new String("ciao"));
		
		for (int i=0; i<v.size(); i++)
			{
				String mai= v.get(i);					//Obbligo il compilatore a vedere l'object come String - Casting
				//System.out.println(v.get(i));
				System.out.println(mai.toUpperCase());		
			}
	}

}
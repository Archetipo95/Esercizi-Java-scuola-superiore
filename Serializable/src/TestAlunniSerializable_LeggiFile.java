
import java.io.*;
public class TestAlunniSerializable_LeggiFile {
	public static void main(String[] args) {
		
		try {
			FileInputStream fi = 
					new FileInputStream("objectalunni.chevuoi");
			ObjectInputStream ois = new ObjectInputStream(fi);
			boolean nonFinito=true;
			while(nonFinito)
			{
				try {
					// ATTENZIONE: Si legge un Object che deve essere 
					// "convertito" nel tipo corretto (dobbiamo saperlo noi!)
					Object ob = ois.readObject();
					AlunnoSerializable al = (AlunnoSerializable)ob;
					System.out.println("Lettura: " + al);
				} catch (EOFException e) {
					nonFinito=false;
				} catch (ClassNotFoundException e) {
					nonFinito=false;
				}
			}
			ois.close();
		} catch (FileNotFoundException e) {
			// blocco eseguito se non si trova il file
			e.printStackTrace();
		} catch (IOException e) {
			// blocco eseguito per una generica eccezione IO
			e.printStackTrace();
		} 
	}
}

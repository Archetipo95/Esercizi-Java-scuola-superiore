
import java.io.*;
public class TestAlunniSerializable_ScriviFile {
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fo = 
					new FileOutputStream("objectalunni.chevuoi");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			
			for(int i=1; i<=3; ++i)
			{
				AlunnoSerializable al = 
						new AlunnoSerializable("Cog"+i, 
								"Nom"+i, 1947+(int)(Math.random()*20));
				System.out.println("scrittura: " + al);
				oos.writeObject(al);
			}
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// blocco eseguito se non si trova il file
			e.printStackTrace();
		} catch (IOException e) {
			// blocco eseguito per una generica eccezione IO
			e.printStackTrace();
		}
	}
}

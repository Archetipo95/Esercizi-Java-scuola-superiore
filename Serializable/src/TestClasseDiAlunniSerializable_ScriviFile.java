
import java.io.*;
public class TestClasseDiAlunniSerializable_ScriviFile {
	public static void main(String[] args) {
		ClasseDiAlunniSerializable classe = new ClasseDiAlunniSerializable();
		for(int i=1; i<=10000; ++i)
		{
			AlunnoSerializable al = 
					new AlunnoSerializable("Cog"+i, "Nom"+i, 1947+(int)(Math.random()*20));
			classe.aggiungiAlunno( al );
		}
		System.out.println("creata:"+classe);

		
		
		
		
		try {
			FileOutputStream fo = new FileOutputStream("objectclasse.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			oos.writeObject(classe);
			System.out.println("Scrittura:"+classe);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}

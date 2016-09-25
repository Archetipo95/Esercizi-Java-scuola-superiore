
import java.io.*;
public class TestClasseDiAlunniSerializable_LeggiFile {
	public static void main(String[] args) {
		
		try {
			FileInputStream fi = new FileInputStream("objectclasse.dat");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Object ob = ois.readObject();
			ClasseDiAlunniSerializable classe = (ClasseDiAlunniSerializable)ob;
			System.out.println("Lettura: " + classe);
			ois.close();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

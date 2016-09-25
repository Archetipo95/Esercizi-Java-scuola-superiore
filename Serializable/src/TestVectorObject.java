

import java.util.Vector;

public class TestVectorObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add( new String("qwerty") );
		v.add( new String("fgrtyi") );
		v.add( new String("astuyiop") );

		for(int i=0; i<v.size(); ++i)
		{
			String mai = v.get(i);
			
			System.out.println( mai.toUpperCase() );
		}
	}

}

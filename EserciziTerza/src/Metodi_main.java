


public class Metodi_main {

	public static void main(String[] args) {
		int i, pos, j;
		double minimo,massimo,min;
		double vett[]=new double [4];
		Metodi.leggiVet(vett);
		minimo=vett[0];
        for (i=1; i<vett.length; i++)
 			{
       	 if (vett[i]<minimo)
       		 minimo=vett [i];
 			}
        
        massimo=vett[0];
        for (i=1; i<vett.length; i++)
 			{
       	 if (vett[i]>massimo)
       		 massimo=vett [i];
 			}
        
        for (i=0;i<vett.length;i++)
  		{
        	min=vett[0];
  		 pos=0;
  			for (j=0;j<vett.length;j++)
        	{
        		if (vett[j]<min)
        		{
        			min=vett[j];
        			pos=j;
        		}
        	}
         //ordinato [i]=min;
    	vett [pos]=1000;
  		}
        
		System.out.println("Il minimo è: "+minimo);
		System.out.println("Il massimo è: "+massimo);
	}

}

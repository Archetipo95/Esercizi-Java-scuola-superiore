/*
 * Fippni Davide, Masevski Martin
 * 3^AI
 *
 */
public class NumeriPrimi
{ public static void main (String args[])
{
int a,b,primo,n=3;
System.out.print("Lista numeri primi: 1");

for (a=2;a<n;a++)
	{
	n++;
	primo=1;
	for(b=2;b<a;b++)
	{
	if (a%b==0)
	{
	primo=0;
	}
	}
	if (primo==1)
	{ System.out.print("-"+a);
	}
	}
}
}






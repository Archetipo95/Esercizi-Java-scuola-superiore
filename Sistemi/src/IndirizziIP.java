/**
 *@author Fipponi Masevski
 * 4^AI
 * 
 */

import java.util.*;

public class IndirizziIP 
{
	public static void main(String[] args) 
	{
		Scanner t = new Scanner(System.in);
		int in1,in2,in3,in4,sub1,sub2,sub3,sub4, n = 0;
		String tipo, classe = "", sottorete;

		System.out.print("Inserisci la prima parte dell'Indirizzo IP: ");
		in1 = t.nextInt();
		while(in1<0 || in1>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la prima parte dell'Indirizzo IP: ");
			in1 = t.nextInt();
		}

		System.out.print("Inserisci la seconda parte dell'Indirizzo IP: ");
		in2 = t.nextInt();
		while(in2<0 || in2>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la seconda parte dell'Indirizzo IP: ");
			in2 = t.nextInt();
		}

		System.out.print("Inserisci la terza parte dell'Indirizzo IP: ");
		in3 = t.nextInt();
		while(in3<0 || in3>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la terza parte dell'Indirizzo IP ");
			in3 = t.nextInt();
		}

		System.out.print("Inserisci la quarta parte dell'Indirizzo IP: ");
		in4 = t.nextInt();
		while(in4<0 || in4>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la quarta parte dell'Indirizzo IP: ");
			in4 = t.nextInt();
		}

		System.out.print("Inserisci la prima parte della subnet mask CORRETTA:");
		sub1 = t.nextInt();
		while(sub1<0 ||sub1>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la prima parte della subnet mask: ");
		}
		System.out.print("Inserisci la seconda parte della subnet mask CORRETTA:");
		sub2 = t.nextInt();
		while(sub2<0 ||sub2>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la seconda parte della subnet mask: ");
			sub2 = t.nextInt();
		}
		System.out.print("Inserisci la terza parte della subnet mask CORRETTA:");
		sub3 = t.nextInt();
		while(sub3<0 ||sub3>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la terza parte della subnet mask: ");
			sub3 = t.nextInt();
		}
		System.out.print("Inserisci la quarta parte della subnet mask CORRETTA:");
		sub4 = t.nextInt();
		while(sub4<0 ||sub4>255){
			System.out.println("Hai sbagliato !");
			System.out.print("Inserisci la quarta parte della subnet mask: ");
			sub4 = t.nextInt();
		}

		if((in1 == 10) || ((in1 == 192) && (in2 == 168)))
		{
			tipo = "privato";
		}
		else
		{
			tipo = "pubblico";
		}
		if(in1==127 && in2==0 && in3==0 && in4==1){
			tipo="localhost";
		}

		if (!((sub1 == 255) && (sub2 == 255)))
		{
			classe = "A";
			n = (255 * 255 * 255) - (3*3);
		}
		else
		{
			if(!(sub3 == 255))
			{
				classe = "B";
				n = (255 * 255) - (3*2);
			}
			
				if(!(sub4 == 255))
				{
					classe = "C";
					n = 255 - 3;
				}
			}

		sottorete = in1 + "." + in2 + "." + in3 + ".0";
		System.out.println("Rete di tipo " + tipo + " e di classe " + classe + "." + "\nLa sottorete a cui appartiene è: " 
				+ sottorete + "\nIl numero di indirizzi possibili in questa rete è: " + n);
	}

}
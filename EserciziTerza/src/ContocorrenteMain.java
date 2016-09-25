import java.util.*;
public class ContocorrenteMain {
	public static void main(String args[]){
		Scanner t=new Scanner (System.in);
		String tit,num="";
		double sald,pre,ver;
		int conto,operazione;
		System.out.println("PRIMO CONTO");
		System.out.print("Inserire titolare conto : ");
		tit=t.nextLine();
		System.out.print("Inserire numero conto: ");
		num=t.nextLine();
		System.out.print("Inserire saldo conto: ");
		sald=t.nextDouble();
		t.nextLine();
		
		ContoCorrente a=new ContoCorrente(tit,num,sald);	
		
		System.out.println("SECONDO CONTO");
		System.out.print("Inserire titolare conto : ");
		tit=t.nextLine();
		System.out.print("Inserire numero conto: ");
		num=t.nextLine();
		System.out.print("Inserire saldo conto: ");
		sald=t.nextDouble();
		
//		String msg= ""+ a;               
//		System.out.println(msg);
		
		ContoCorrente b=new ContoCorrente(tit,num,sald);
		
		do{
		System.out.println();
		System.out.print("Su quale conto vuoi lavorare? ");
		System.out.println("Premere 1 o 2: ");
		conto=t.nextInt();
		//PRIMO CONTO
		if(conto==1){
			System.out.println("MENU");
			System.out.println("1)Prelievo\n2)Versamento\n3)Verifica saldo");
			operazione=t.nextInt();
			if(operazione==1){
				System.out.println("Quanto vuoi prelevare? ");
				pre=t.nextDouble();
				if(pre<=0){
					System.out.println("Non Puoi!");
				}
				a.Prelievo(pre);
			}
			if(operazione==2){
				System.out.println("Quanto vuoi versare? ");
				ver=t.nextDouble();
				if(ver<=0){
					System.out.println("Non Puoi!");
				}
				a.Versamento(ver);	
			}
			if(operazione==3){
				a.VerificaSaldo();
			}
		}
			//SECONDO CONTO
		if(conto==2){
			System.out.println("MENU");
			System.out.println("1)Prelievo\n2)Versamento\n3)Verifica saldo");
			operazione=t.nextInt();
			if(operazione==1){
				System.out.println("Quanto vuoi prelevare? ");
				pre=t.nextDouble();
				if(pre<=0){
					System.out.println("Non Puoi!");
				}
				b.Prelievo(pre);
			}
			if(operazione==2){
				System.out.println("Quanto vuoi versare? ");
				ver=t.nextDouble();
				if(ver<=0){
					System.out.println("Non Puoi!");
				}
				b.Versamento(ver);	
			}
			if(operazione==3){
				b.VerificaSaldo();
			}
		}
		}while(conto<3 && conto>0);
		}
		}

	


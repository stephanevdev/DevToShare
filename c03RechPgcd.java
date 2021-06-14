import java.util.*;
	
public class c03RechPgcd {

		public static int pgcd(int _a, int _b) {
			
			int p = _a;
			int q= _b;
			
			while (p!=q
					)
			{
				if(p>q)
				p = p - q;
			else
				q = q - p;
			}
			
		return q;
		}
		
		
		public static void main(String[] args) {
		
		System.out.println("Saisir le numérateur puis le dénominateur");
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		
		int pgcd=pgcd(p,q);
		System.out.println("Le pgcd de "+p+" et "+q+" est : "+pgcd);
		System.out.println("La fraction simplifiée vaut : "+(p/pgcd)+"/"+(q/pgcd));
	}
	}	


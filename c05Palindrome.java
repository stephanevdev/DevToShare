import java.util.*;

public class c05Palindrome {

	public static void main(String[] args) {
		String mot = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un mot : ");
		mot = sc.nextLine();
		
		if(pal(mot))
		{	System.out.println("Le mot " +mot+" est un palindrome");
		}
		else
		{
			System.out.println("Le mot "+mot+" n'est pas un palindrome");
		}
	}
		public static boolean pal(String mot)
		{
		 
			int taille = mot.length();
			int cpt=0;
			boolean tst=true;
			
			
			while(cpt<=(taille-1)/2 && tst)
			{ 
				if (mot.charAt(cpt)==mot.charAt(taille-1-cpt))
				{	cpt++;
				}
				else
				{ tst=false;
				}
			}	
			
			return tst;
				}
				

	}



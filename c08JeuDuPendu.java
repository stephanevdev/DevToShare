import java.util.*;

public class c08JeuDuPendu {
	
	public static boolean ctrlStrSaisie(String mot, int nbl) // Cette fonction vérifie que le mot saisi est conforme
	{	
		
		//boolean pb=false;
		boolean pb=false;
		int taille = mot.length();
				
		if(taille>nbl || taille==0)
		{	pb=true;
			System.out.println("Taille du mot incorrecte");
		}
		else
		{
			for(int i= 0; i<taille-1; i++)
			{
				if(mot.charAt(i)<'A' || (mot.charAt(i)>'Z' && (mot.charAt(i)<'a')) || mot.charAt(i)>'z')
				{	
					System.out.print(mot.charAt(i));
					pb=true;
				}
				else {
					pb=ctrlSaisieLettre(mot.charAt(i));
						}
			}
		}
return pb;

}



 public static boolean ctrlSaisieLettre(char lettre) 
 { 
	 boolean pb=false;
 
	 if(lettre<'A' || (lettre>'Z' && lettre <'a') || lettre>'z')
	 	{
		 	System.out.print(lettre+ "=Caractère non valide"); 
		 	pb=true; 
	 	} 	
	 else {
		 lettre=Character.toUpperCase(lettre);
		}
	 
	
return pb;		
	
}
	public static void pendu (int n)
{
		String [] T = new String[10];
		
		String str="";
		switch (n)
		{
		case 6:
			T[1]="  ______  \n";
			T[2]="	|     |   \n";
			T[3]="	|       \n";
			T[4]="	|       \n";
			T[5]="	|       \n";
			T[6]="	|       \n";
			T[7]="	|       \n";
			T[8]="	|       \n";
			T[9]="	|__________\n";
			
			break;
			case 5:
			T[1]="          \n";
			T[2]=" ______    \n";
			T[3]="|     O   \n";
			T[4]="|         \n";
			T[5]="|         \n"; 
			T[6]="|         \n";
			T[7]="|         \n";
			T[8]="|         \n";
			T[9]="|__________\n";
			break;
			case 4:
			T[1]="          \n";
			T[2]=" ______    \n";
			T[3]="|     O   \n";
			T[4]="|   |_ _|  \n";
			T[5]="|         \n";
			T[6]="|          \n";
			T[7]="|          \n";
			T[8]="|           \n";
			T[9]="|__________\n";
			break;
			case 3:
				T[1]="          \n";
				T[2]=" ______    \n";
				T[3]="|     O   \n";
				T[4]="|   |_ _|  \n";
				T[5]="|     |    \n";
				T[6]="|     |  \n";
				T[7]="|         \n";
				T[8]="|         \n";
				T[9]="|__________\n";
				break;
			case 2:
				T[1]="          \n";
				T[2]=" ______     \n";
				T[3]="|     O   \n";
				T[4]="|   |_ _|  \n";
				T[5]="|     |    \n";
				T[6]="|    _|_  \n";
				T[7]="|   /   |  \n";
				T[8]="|          \n";
				T[9]="|__________\n";
				break;
			case 1:
				T[1]="          \n";
				T[2]= "______   \n";
				T[3]="|     O   \n";
				T[4]="|   |_ _|  \n";
				T[5]="|     |    \n";
				T[6]="|    _|_  \n";
				T[7]="|   /   |  \n";
				T[8]="|  /	  |  \n";
				T[9]="|__________\n";
				break;
			case 0:
				T[1]=" ______   \n";
				T[2]="|     |     \n";
				T[3]="|     O   \n";
				T[4]="|   |_ _|  \n";
				T[5]="|     |    \n";
				T[6]="|    _|_  \n";
				T[7]="|   /   |  \n";
				T[8]="|  /    |  \n";
				T[9]="|__________\n";
			
		     break;			}

	

for(int i=1; i<=9;i++)
{	System.out.print(T[i]);
}
		}
		
	
		
	public static void main(String[] args) 
	{
		int nbcoup=6;
		int i;
		Scanner sc = new Scanner(System.in);	
		Scanner sc1 = new Scanner(System.in);
		
		boolean pb=true;
	
		String mot, motmystere, motcache="";
		
		System.out.print("				Jeu du pendu \n \n 			Choisir la taille max du mot: " );
		
		int nbl = sc1.nextInt();
		//System.out.println("Saisir un mot de "+nbl+ " lettres");
	
		do
		{
				System.out.println("		\n \n Saisir un mot de "+nbl+" lettres" );
				
				mot = sc.nextLine();
			
			System.out.println("Le mot choisi est : "+mot);
		
				pb = ctrlStrSaisie(mot,nbl);	
			
		}while(pb);// Jusqu'à ce que le mot convienne
		
		
		System.out.println("-------------Debut du jeu ------------\n\n");
		
			motmystere = mot.toUpperCase();
		
			motcache=motmystere.charAt(0)+motcache;
		
			for (i=1; i<(motmystere.length())-1; i++)
			{
				motcache=motcache+'-';
			}
				motcache=motcache+motmystere.charAt(motmystere.length()-1);
	
		for ( i = 0; i <motcache.length(); i++)
		{
			
			System.out.print(motcache.charAt(i)+" " );
			
		}
		
		
		
		char lettremaj;
		String lettrechoisie="";
		
		boolean trouvemot=false;
		boolean trouvelettre=false;
		int cpttiret=0;				
		int cpttrouve=0;
		
		/*	Début du test  */
		do
		{
			System.out.print("	Il vous reste "+nbcoup+" essais\n ");
			System.out.println("	Choisir une lettre  ");
	
				do
				{
					pb=false;
					
						lettrechoisie= sc.nextLine();//.charAt(0);
						
						  if((int) lettrechoisie.charAt(0)<65 || (((int) lettrechoisie.charAt(0)>90) &&
						  ((int) lettrechoisie.charAt(0) <97)) ||((int) lettrechoisie.charAt(0)>122))
						  {
						  System.out.print("*"+(int) lettrechoisie.charAt(0)+"*=Caractère non valide");
						  pb=true; 
						  
						  }						  
					
				}while (pb);
			
			/*Test de l'existence de la lettre saisie*/
				
			lettremaj=Character.toUpperCase(lettrechoisie.charAt(0));
			
			trouvelettre=false;
			trouvemot=false;
			cpttrouve=0;
			cpttiret=0;
			
			for(i=1; i<motmystere.length()-1;i++)		
			{
			
				if(motmystere.charAt(i)==lettremaj)
					{
						//trouvelettre=true;
						//cpttrouve++;
										
						if(motcache.charAt(i)=='-')
							{cpttrouve++;
							
							motcache=motcache.substring(0,i) + lettremaj + motcache.substring(i+1);
							
							}
					}
				else {
						if (motcache.charAt(i)=='-')	
							{	
							cpttiret++;
							}
					}	
				
			}
			
					if((cpttiret==0) && cpttrouve>=0)
					{trouvemot=true;
					
					
					}
					else {
						if(cpttiret>0 && cpttrouve==0)
							{
							trouvemot=false;
							nbcoup--;
							}
							else
							{
								trouvemot=false;
									}
							
							
						}
					for ( int j = 0; j <motcache.length(); j++)
					{
			
					System.out.print(motcache.charAt(j)+" " );
					}
			//}
		pendu(nbcoup);
				
	}	while(nbcoup>0 && trouvemot==false);
			
		
		if( trouvemot==true)
		
			
		{	System.out.println("Gagne!!  en "+ (6-nbcoup)+ " erreurs");
		
			for(i=0;i<=(motcache.length())-1;i++)
		
			{	
			System.out.print(motcache.charAt(i)); 
		
			}
		}
		else 
			{System.out.print("Perdu");
}
sc.close();
sc1.close();

			
			
			
		}
	}
		
	

	
		
	
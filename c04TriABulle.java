import java.util.*;

public class c04TriABulle {
	
	public static void main(String[] args) {
		
		int numCourant;
		int cpt=1;
		int nbPermut=0;
		int nbcycle=0;
		
		int [] numTab = new int[10];
		Random rand = new Random();
	
		
		for(int i=0; i<numTab.length; i++)
		{
			numTab[i] = rand.nextInt(50);
		
		}
		
		System.out.println("Valeurs à ordonner dans l'ordre croissant");
		
		for(int i=0; i<numTab.length-1; i++)
		{
			int value = numTab[i];
			System.out.print( value+" ");
			
		}
		System.out.println("\nDebut du tri");
		
		while(cpt>0)
		{	
			cpt = 0;
			nbcycle++;
			
			for(int i=0; i<numTab.length-1; i++)
			{
				numCourant = numTab[i];
			
				if(numTab[i]>numTab[i+1])
				{
					numTab[i]=numTab[i+1];
					
					numTab[i+1]=numCourant;
		
					cpt++;
				}
			
			}
				
				//System.out.println("Nombre de permutations :"+ nbPermut);
				for(int j=0; j<numTab.length-1; j++)
				{
					int value = numTab[j];
					System.out.print( value+" ");
				}
				System.out.println("Cycle Numero : "+ nbcycle+" - Nombre de permutations : "+ cpt);	
				nbPermut = nbPermut + cpt;
		
				
		}
			
		System.out.println("Nombre de permutations : "+ nbPermut);	
		}
	
		
		
	}
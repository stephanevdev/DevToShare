import java.util.*;
public class c06DepenseMag {

	public static void main(String[] args) {
		// Exercice : Calcul du montant dépensé dans le dernier magasin 
		//Version 1
				
				double sominit; //Somme disponible au départ
				double rangmag; //Rang du magasin
				double depenselastmag; //Somme dépensée dans le dernier magasin
				
				System.out.println("Somme disponible au départ :");
				Scanner sc=new Scanner(System.in);
				sominit=sc.nextInt();
				
				System.out.println("Rang du magasin concerné :");
				Scanner sc1=new Scanner(System.in);
				rangmag=sc1.nextInt();
				
				depenselastmag=((1/(Math.pow(2, rangmag)))*sominit)+((Math.pow(2, rangmag)-1)/(Math.pow(2,(rangmag-1))));
				
				System.out.print("Les dépenses effectuées dans le "+rangmag+"eme "+"magasin sont de "+depenselastmag);
			}



	}



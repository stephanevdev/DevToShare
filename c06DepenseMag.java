import java.util.*;
public class c06DepenseMag {

	public static void main(String[] args) {
		// Exercice : Calcul du montant d�pens� dans le dernier magasin 
		//Version 1
				
				double sominit; //Somme disponible au d�part
				double rangmag; //Rang du magasin
				double depenselastmag; //Somme d�pens�e dans le dernier magasin
				
				System.out.println("Somme disponible au d�part :");
				Scanner sc=new Scanner(System.in);
				sominit=sc.nextInt();
				
				System.out.println("Rang du magasin concern� :");
				Scanner sc1=new Scanner(System.in);
				rangmag=sc1.nextInt();
				
				depenselastmag=((1/(Math.pow(2, rangmag)))*sominit)+((Math.pow(2, rangmag)-1)/(Math.pow(2,(rangmag-1))));
				
				System.out.print("Les d�penses effectu�es dans le "+rangmag+"eme "+"magasin sont de "+depenselastmag);
			}



	}



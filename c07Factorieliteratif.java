
import java.util.*;

public class c07Factorieliteratif {
	public static double factoriel (int n) {
	
		double result=1;
		for(int i=0; i<n;i++)
		{
			result = result*(i+1);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
	System.out.print("Donner un nombre pour connaître son factoiriel");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		double fact = factoriel(n);
		
		System.out.print("Factoriel "+n+" = "+fact);
	}

}

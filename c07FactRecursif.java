import java.util.Scanner;

public class c07FactRecursif {
	public static double factoriel(int n) {
		
		if(n==0)
			return 1;
		else
		{
			return factoriel(n-1) *n;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Donner un nombre pour connaître son factoiriel");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double result =factoriel(n);
		System.out.print("Factoriel "+n+" = "+result);
	}

}

import java.util.Scanner;

public class c02Tableau2DTri {
	// On remplit le tableau
	

	public static String strSaisie (){
		
		System.out.println("\nSaisir la phrase : ");		
		Scanner sc = new Scanner(System.in);
		String PhraseDep = sc.nextLine();
							
		return PhraseDep;
	}
		
	public static String strCharAccent(String PhraseDep){
		String Phrase="";
		for (int i = 0;  i<PhraseDep.length(); i++)
		{	
			char c = PhraseDep.charAt(i);
			
			if( c =='à' || c=='â')
				c='a';
			if( c =='é' || c=='è' || c=='ê' || c=='ë')
				c='e';
			if( c =='ç')
				c='c';
			if( c =='û' || c=='û' || c=='ù')
				c='u';
			if( c =='ô')
				c='o';
			if (c>=65 && c<=90)
				c=(char) (c+32);
			if (c<97 || c>122)
				c='0';
			
			Phrase = Phrase+c;
			
		}
		return Phrase;
	}
	
	public static int [][] charTabTri(String Phrase) {
		int [][] Tabcode= new int[2][26]; //initialisation implicite à 0
		int nblettres=0;
		for (int i = 0;  i<Phrase.length(); i++)
		{	char c = Phrase.charAt(i);
			boolean existe = false;
			int newcode = (int) c;
			int j=0;
		
			while(j<26 )
			{	
				if( Tabcode[0][j]==0 &&  existe == false)// en parcourant la phrase, si le code de la lettre rencontrée n'existe pas dans le tableau
				{	Tabcode[0][j]=newcode; // on insère ce code dans la première case dont le code est à 0
					Tabcode[1][j]=1;
					existe=true;
					nblettres++;
					
				}
				else if (Tabcode[0][j]==newcode && existe == false)// si le code existe deja dans le tableau
				{	Tabcode[1][j]=Tabcode[1][j]+1;// on incrémente uniquement son nombre d'occurrences
					existe=true;
					
				}
				
				else j++;// sinon, on teste le code suivant jusqu'à rencontrer le code s'il l'a deja été ou le code 0 si c'est la première fois qu'on le rencontre
	
			}
		}
		
		int permut=1;
		 int temp;
		  int temp1;
		while (permut>0)
		{permut=0;

			for(int col = 0; col < nblettres-1; col++)
			{
				if( Tabcode[1][col]>Tabcode[1][col+1] && Tabcode[0][col]>0)
				{ 	
					temp=Tabcode[1][col];
					
				
					Tabcode[1][col]=Tabcode[1][col+1];
				
					Tabcode[1][col+1]=temp;
				
			
					temp1=Tabcode[0][col];
				
					Tabcode[0][col]=Tabcode[0][col+1];
				
					Tabcode[0][col+1]=temp1;
				
					permut++;
				
				}
			}
		}
		
		
		return Tabcode;
}
	
	
	public static void main(String[] args) {
	
	String PhraseDep=strSaisie();
	
	String Phrase=strCharAccent(PhraseDep);


	int Tabcode[][] =charTabTri(Phrase);
	String result = new String("La lettre " );
	for(int col=0; col<=23; col++)
		if (Tabcode[0][col]>'0') 
	{System.out.println("La lettre "+ (char) Tabcode[0][col] +" figure "+ Tabcode [1][col] + " fois dans la phrase");
	
	}
}
	
}


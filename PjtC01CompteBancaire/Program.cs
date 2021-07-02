using System;

namespace PjtC01CompteBancaire
{
    class Program
    {
        static void Main(string[] args)
        {
            CptBancaire cptToto = new CptBancaire(12345, "Toto", 1000, -500);
            CptBancaire cptLaurent = new CptBancaire(545454, "Laurent", 2000, -500);

            //Appel des méthodes créditer et débiter

            //cptToto.Crediter(2000);
            cptToto.Debiter(0);

            //Affichage

            string msg = "numéro : " + cptToto.numcpt.ToString() + " nom : " + cptToto.nomcli + " solde " + cptToto.solde.ToString() + " decouvertAutorisé : " + cptToto.decouvertAutorise.ToString() + ".";
            Console.WriteLine(msg);
            msg = "numéro : " + cptLaurent.numcpt.ToString() + " nom : " + cptLaurent.nomcli + " solde " + cptLaurent.solde.ToString() + " decouvertAutorisé : " + cptLaurent.decouvertAutorise.ToString() + ".";
            Console.WriteLine(msg);

          
            cptLaurent.Crediter(100);

            cptLaurent.Debiter(100000);

            cptLaurent.Afficher();
            CptBancaire cptTiti = new CptBancaire(45657, "Titi", 2000, -1000);

            bool debite =cptToto.Debiter(3300);
            if (debite)
            {
                cptTiti.Crediter(3300);
            }

            bool sup = cptToto.SoldeCpt(cptToto.solde, cptTiti.solde);
               

            
            cptToto.Afficher();
            cptTiti.Afficher();

            Console.Read();

        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PjtC01CompteBancaire
{
    class Program
    {
        static void Main(string[] args)
        {
            CptBancaire cptToto; //déclaration de l'objet 
            CptBancaire cpt;
            cptToto = new CptBancaire(); // Instanciation de l'objet cptToto
            cpt = new CptBancaire();

            //Instantciation des attibuts pour Etape 1?

            cptToto.numcpt = 12345;
            cptToto.nomcli = "Toto";
            cptToto.solde = 1000;
            cptToto.decouvertAutorise = -500;


            //Appel des méthodes créditer et débiter;

            cptToto.Crediter(2000);
            cptToto.Debiter(0);


            //Affichage
            //Affichage

            string msg = "numéro : " + cptToto.numcpt.ToString() + " nom : " + cptToto.nomcli + " solde " + cptToto.solde.ToString() + " decouvertAutorisé : " + cptToto.decouvertAutorise.ToString() + ".";
            Console.WriteLine(msg);
            Console.Read();
        }
    }
}

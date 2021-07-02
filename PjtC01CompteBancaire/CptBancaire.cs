using System;

namespace PjtC01CompteBancaire
{
    class CptBancaire
    {
        private long numcpt;
        private string nomcli;
        private double solde;
        private double decouvertAutorise;

        //Constructeur
        public CptBancaire(long _numcpt, string _nomcli, double _solde, double _decouvertAutorise)
        {
            this.numcpt = _numcpt;
            this.nomcli = _nomcli;
            this.solde = _solde;
            this.decouvertAutorise = _decouvertAutorise;

        }
        public void Crediter(double montant)
        {
            solde += montant;

        }
        bool debite = false;
        string msg;
        public bool Debiter(double montant)
        {
           
            if ((montant + decouvertAutorise) > solde)
            {
                
                msg = "Debit refusé";
                return false;
            }


            else
            {
                solde -= montant;
                msg = ("Débit Réussi!");
                return true;
            }
           
        }
        public bool SoldeCpt( double sold1, double sold2)
        {
            if (sold1 > sold2)
            {
                msg = "Supérieur";
                return true;
                
            }
            else
            {
                msg = "Inférieur";
                return false;
            }
        }
        public void Afficher()
        {
            msg = msg + " // numéro : " + numcpt.ToString() + " nom : " + nomcli + " solde " + solde.ToString() + " decouvertAutorisé : " + decouvertAutorise.ToString() + ".";
            Console.WriteLine(msg);
        }


    }
}
        
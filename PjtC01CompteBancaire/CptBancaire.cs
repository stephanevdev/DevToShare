using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PjtC01CompteBancaire
{
    class CptBancaire
    {
        public long numcpt;
        public string nomcli;
        public double solde;
        public double decouvertAutorise;

        public void Crediter(double montant)
        {
            solde = solde + montant;

        }
        public void Debiter(double montant)
        {
            solde = solde + montant;

        }
    }
}

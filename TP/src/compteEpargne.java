public class CompteEpargne extends Compte {
        private long decouvert;

        public double getDecouvert() {
            return this.decouvert;
        }

        public void setDecouvert(int decouvert) {
            this.decouvert = decouvert;
        }

        public CompteEpargne(Client proprietaire, int solde, int decouvert) {
            super(proprietaire, solde);
            this.decouvert = decouvert;
        }


}

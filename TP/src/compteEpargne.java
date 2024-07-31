public class CompteEpargne extends Compte {
        private long decouvert;

        public double getDecouvert() {
            return this.decouvert;
        }

        public void setDecouvert(int decouvert) {
            this.decouvert = decouvert;
        }

        public CompteEpargne(Client proprietaire, int numero, int solde, int decouvert) {
            super(proprietaire,numero, solde);
            this.decouvert = decouvert;
        }

        public CompteEpargne() {

        }

}

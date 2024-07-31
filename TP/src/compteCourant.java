public class CompteCourant extends Compte {
    private double decouvert;

    public double getDecouvert() {
        return this.decouvert;
    }

    public Void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
        return null;
    }

    public CompteCourant(Client proprietaire, int numero, long solde, int decouvert) {
        super(proprietaire, numero, solde);
        this.decouvert = decouvert;
    }

    public CompteCourant() {

    }

    @Override
    public double retirer(double solde, int retrait) {
        if (this.getSolde() - retrait < decouvert) {
            setSolde(this.getSolde() - retrait);
            System.out.println("Nouveau solde : " + this.getSolde());
        }
        return this.getSolde();
    }

}

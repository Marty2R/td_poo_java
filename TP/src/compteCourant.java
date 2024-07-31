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
        super(proprietaire, solde, decouvert);
        this.decouvert = decouvert;
    }

    public CompteCourant() {

    }

}

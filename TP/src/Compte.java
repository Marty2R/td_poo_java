abstract class Compte {
    private Client proprietaire;
    private final long numero;
    private double solde;
    static int compter;

    public Compte(Client proprietaire, double solde) {
        compter++;
        this.proprietaire = proprietaire;
        this.numero = compter;
        this.solde = solde;
    }

    public Client getProprietaire() {
        return this.proprietaire;
    }

    public double getNumero() {
        return this.numero;
    }

    public double getSolde() {
        return this.solde;
    }

    public Client setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
        return proprietaire;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double retirer(double solde, int retrait) {
        if (this.getSolde() - retrait < 0) {
            setSolde(this.getSolde() - retrait);
        }
        return this.getSolde();
    }
}

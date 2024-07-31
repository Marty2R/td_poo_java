abstract class Compte {
    private Client proprietaire;
    private long numero;
    private double solde;

    public Compte(Client proprietaire,long numero, double solde) {
        this.proprietaire = proprietaire;
        this.numero = numero;
        this.solde = solde;
    }

    public Compte() {

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

    public void setNumero(int numero) {
        this.numero = numero;
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

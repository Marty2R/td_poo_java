public abstract class compte {
    private String proprietaire;
    private int numero;
    private int solde;

    public compte(String proprietaire,int numero, int solde) {
        this.proprietaire = proprietaire;
        this.numero = numero;
        this.solde = solde;
    }

    public compte() {
        this.proprietaire = proprietaire;
        this.numero = numero;
        this.solde = solde;
    }

    public String getProprietaire() {
        return this.proprietaire;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getSolde() {
        return this.solde;
    }

    public String setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
        return proprietaire;
    }

    public int setNumero(int numero) {
        this.numero = numero;
        return numero;
    }

    public int setSolde(int solde) {
        this.solde = solde;
        return solde;
    }

    public void retirer(int montant) {

    }
}

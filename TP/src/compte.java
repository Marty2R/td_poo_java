public class compte {
    private String proprietaire;
    private int numero;
    private int solde;
    private int decouvert;

    public String getProprietaire() {
        return this.proprietaire;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getSolde() {
        return this.solde;
    }

    public int getDecouvert() {
        return this.decouvert;
    }

    public String setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
        return null;
    }

    public Void setNumero(int numero) {
        this.numero = numero;
        return null;
    }

    public Void setsolde(int solde) {
        this.solde = solde;
        return null;
    }

    public Void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
        return null;
    }


}

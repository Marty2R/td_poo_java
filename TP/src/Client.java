public class Client {
    public String prenom;
    public String nom;

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public Void setPrenom(String prenom) {
        this.prenom = prenom;
        return null;
    }

    public Void setNom(String nom) {
        this.nom = nom;
        return null;
    }

    public static void main(String[] args) {

        Client premierClient = new Client();
        premierClient.prenom = "Louis";
        premierClient.nom = "Bagatti";

        System.out.println(premierClient.toString());

    }

}

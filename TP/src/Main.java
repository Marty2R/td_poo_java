//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("---- TP Banque ----");
        System.out.println("------------------");

        // CLIENT
        Client client = new Client("Louis", "Bugatti");
            System.out.println(client.getPrenom());
            System.out.println(client.getNom());
            System.out.println("------------------");

        // COMPTE COURRANT
        CompteCourant comptecourant = new CompteCourant(client, 987654321, 200, 300);
            System.out.println("COMPTE COURANT");
            System.out.println(comptecourant.getProprietaire().toString());
            System.out.println("Solde : " + comptecourant.getSolde());
            System.out.println("Découvert : " + comptecourant.getDecouvert());
            System.out.println("------------------");
            System.out.println("-- Retrait compte courant --");
            System.out.println(comptecourant.retirer(comptecourant.getSolde(), 100));
            System.out.println("------------------");

        // COMPTE EPARGNE
        CompteEpargne compteepargne = new CompteEpargne(client, 123456789, 50, 100);
            System.out.println("COMPTE EPARGNE");
            System.out.println(compteepargne);
            System.out.println(compteepargne.getProprietaire().toString());
            System.out.println("------------------");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("--- Hello Word ---");

        // CLIENT
        Client client = new Client();
            client.setPrenom("Louis");
            client.setNom("Bugatti");
            System.out.println(client.toString());

        // COMPTE COURRANT
            compteCourant comptecourant = new compteCourant();
            comptecourant.setProprietaire("Louis");
            //comptecourant.setNumero(123456789);
            comptecourant.setsolde(45);
            comptecourant.setDecouvert(0);
            System.out.println(comptecourant.toString());

        // COMPTE EPARGNE
        compteEpargne compteepargne = new compteEpargne();
            compteepargne.setProprietaire("Louis");
            compteepargne.setNumero(123456789);
            compteepargne.setsolde(45);
            compteepargne.setDecouvert(0);
            System.out.println(compteepargne.toString());

    }
}
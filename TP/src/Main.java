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

        // COMPTE
        compteCourrant compte = new compteCourrant();
            compte.setProprietaire("Louis");
            compte.setNumero(123456789);
            compte.setsolde(45);
            compte.setDecouvert(0);
            System.out.println(compte.toString());

    }
}
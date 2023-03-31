public class Main {
    public static void main(String[] args) {
        Personne toto = new Personne("Toto");
        Personne tata = new Personne("Tata");

        Entreprise amazon = new Entreprise("Amazon");

        toto.donner(50.0);
        tata.donner(20.0);

        amazon.donner(5000.0);

        System.out.println("La somme totale versé est: " + SCagnotte.getInstanceCagnotte().getSommeTotal());
    }
}
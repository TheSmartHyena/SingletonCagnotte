public class Cagnotte {
    private double somme = 0.0;

    public void ajouter(double valeur) {
        this.somme += valeur;
    }

    public double getSommeTotal() {
        return this.somme;
    }
}

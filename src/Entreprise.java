public class Entreprise {
    private double sommeDonner = 0.0;
    private String nom = "";

    public Entreprise(String nom) {
        this.nom = nom;
    }

    public void donner(double somme) {
        sommeDonner += somme;
        SCagnotte.getInstanceCagnotte().ajouter(somme);
        System.out.println("L'entreprise: "+ this.nom + " a donné: " + somme);
    }

}

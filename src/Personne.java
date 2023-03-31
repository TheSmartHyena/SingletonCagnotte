public class Personne {
    private double sommeDonner = 0.0;
    private String nom = "";

    public Personne(String nom) {
        this.nom = nom;
    }
    public void donner(double somme) {
        sommeDonner += somme;
        SCagnotte.getInstanceCagnotte().ajouter(somme);
        System.out.println("La personne: "+ this.nom + " a donné: " + somme);
    }

}

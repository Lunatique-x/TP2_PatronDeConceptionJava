public abstract class CarteClient {
    String nom;
    String adresse;

    public CarteClient(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public abstract void recompenser(Facture f);

    public abstract void retirer(Facture f);
}   

package cartes;

public abstract class CarteClient {
    protected String nom;
    protected String adresse;

    public CarteClient(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public abstract void appliquerRecompense(MethodeStrategie.facture.Facture f);
}
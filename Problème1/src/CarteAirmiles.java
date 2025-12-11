public class CarteAirmiles extends CarteClient {
    float nb_mile;

    public CarteAirmiles(String nom, String adresse) {
        super(nom, adresse);
        nb_mile = 0;
    }

    public void recompenser(Facture f) {
        switch (f.getModePaiement().getType()) {
            case "credit":
                nb_mile += f.getMontant() * 2;
                break;
            
            case "cash":
                nb_mile += f.getMontant() / 2;
                break;

            default:
                System.out.println("Aucune récompense pour ce mode de paiement.");
                break;
        }
        System.out.println("Miles accumulés : " + nb_mile);
    }

    public void retirer(Facture f) {
        nb_mile -= f.getMontant();
    }

    public float getNombreMiles() { return nb_mile; }
}

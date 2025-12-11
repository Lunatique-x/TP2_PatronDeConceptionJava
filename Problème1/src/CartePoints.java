public class CartePoints extends CarteClient {
    private int nb_points;

    public CartePoints(String nom, String adresse) {
        super(nom, adresse);
        nb_points = 0;
    }

    public void recompenser(Facture f) {
        switch (f.getModePaiement().getType()) {
            case "credit":
                nb_points += f.getMontant() * 2;
                break;
            
            case "cash":
                nb_points += f.getMontant();
                break;

            default:
                System.out.println("Aucune récompense pour ce mode de paiement.");
                break;
        }
        System.out.println("Points accumulés : " + nb_points);
    }

    public void retirer(Facture f) {
        nb_points -= f.getMontant();
    }

    public int getNombrePoints() { return nb_points; }
}

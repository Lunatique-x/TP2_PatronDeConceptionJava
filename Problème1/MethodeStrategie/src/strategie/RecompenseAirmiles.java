package strategie;;

import facture.Facture;

public class RecompenseAirmiles implements StrategieRecompense {
    private float nbMiles = 0;

    @Override
    public void appliquer(Facture f) {
        switch (f.getModePaiement().getType()) {
            case "credit":
                nbMiles += f.getMontant() * 2;
                break;
            case "cash":
                nbMiles += f.getMontant() / 2;
                break;
            default:
                System.out.println("Aucune récompense pour ce mode de paiement.");
        }
        System.out.println("Miles accumulés : " + nbMiles);
    }

    public float getNbMiles() {
        return nbMiles;
    }
}public class RecompenseAirmiles {

}

package strategie;

import facture.Facture;

public class RecompensePoints implements StrategieRecompense {
    private int nbPoints = 0;

    @Override
    public void appliquer(Facture f) {
        switch(f.getModePaiement().getType()) {
            case "credit": nbPoints += f.getMontant() * 2; break;
            case "cash": nbPoints += f.getMontant(); break;
            default: System.out.println("Aucune recompense pour ce type de paiement."); break;
        }
        System.out.println("Points accumulers : " + nbPoints);
    }

    public int getNbPoints() { return nbPoints; }
}
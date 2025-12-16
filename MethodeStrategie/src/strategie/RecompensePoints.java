package strategie;

import facture.Facture;

public class RecompensePoints implements StrategieRecompense {
    private int nbPoints = 0;

    @Override
    public void appliquer(Facture f) {
        nbPoints += f.getMontant() * 2;
        System.out.println("Points accumulers : " + nbPoints);
    }

    public int getNbPoints() { return nbPoints; }
}
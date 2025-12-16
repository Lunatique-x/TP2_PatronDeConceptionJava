
package cartes;

import facture.Facture;
import strategie.RecompensePoints;
import strategie.StrategieRecompense;

public class CartePoints extends CarteClient {
    private StrategieRecompense strategie;

    public CartePoints(String nom, String adresse, StrategieRecompense strategie) {
        super(nom, adresse);
        this.strategie = strategie;
    }
    @Override
    public String getRecompense() {
    return nom + " (Points) : " + ((RecompensePoints)strategie).getNbPoints() + " points";
    }


    public void appliquerRecompense(Facture f) {
        strategie.appliquer(f);
    }
}
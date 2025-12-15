
package cartes;

import strategie.StrategieRecompense;
import facture.Facture;

public class CartePoints extends CarteClient {
    private StrategieRecompense strategie;

    public CartePoints(String nom, String adresse, StrategieRecompense strategie) {
        super(nom, adresse);
        this.strategie = strategie;
    }

    public void appliquerRecompense(Facture f) {
        strategie.appliquer(f);
    }
}
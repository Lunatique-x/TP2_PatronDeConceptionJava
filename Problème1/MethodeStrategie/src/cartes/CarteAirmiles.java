package cartes;

import facture.Facture;
import strategie.StrategieRecompense;

public class CarteAirmiles extends CarteClient {
    private StrategieRecompense strategie;

    public CarteAirmiles(String nom, String adresse, StrategieRecompense strategie) {
        super(nom, adresse);
        this.strategie = strategie;
    }

    public void appliquerRecompense(Facture f) {
        strategie.appliquer(f);
    }
}
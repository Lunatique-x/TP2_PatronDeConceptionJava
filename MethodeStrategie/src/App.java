import cartes.*;
import facture.Facture;
import paiement.*;
import strategie.*;

public class App {
    public static void main(String[] args) {
        // Modes de paiement
        ModePaiement cash = new PaiementCash();
        ModePaiement credit = new PaiementCredit();

        // Stratégies
        StrategieRecompense points = new RecompensePoints();
        StrategieRecompense airmiles = new RecompenseAirmiles();

        // Cartes
        CarteClient cartePoints = new CartePoints("Alice", "Montreal", points);
        CarteClient carteAirmiles = new CarteAirmiles("Bob", "Montreal", airmiles);

        // Factures
        Facture f1 = new Facture(50, cash, cartePoints);
        Facture f2 = new Facture(100, credit, carteAirmiles);
    }
}
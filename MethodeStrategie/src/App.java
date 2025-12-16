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

         // ===== Afficher récompenses accumulées =====
        System.out.println("\n--- Recompenses finales ---");
        CarteClient[] cartes = {cartePoints, carteAirmiles};
        for (CarteClient c : cartes) {
            System.out.println(c.getRecompense());
        }

    }
    
}


// vous devez executer le bin pour voir le code cd MethodesStrategie puis java -cp bin App
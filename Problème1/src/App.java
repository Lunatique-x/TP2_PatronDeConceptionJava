public class App {
    public static void main(String[] args) throws Exception {
        // ===== Création des modes de paiement =====
        ModePaiement paiementCash = new PaiementCash();
        ModePaiement paiementCredit = new PaiementCredit();
        ModePaiement paiementDebit = new PaiementDebit();
        ModePaiement paiementPoints = new PaiementPoints();

        // ===== Création des cartes clients =====
        CarteClient cartePoints = new CartePoints("Alice", "3800, boulevard Sherbrooke, Montréal");
        CarteClient carteAirmiles = new CarteAirmiles("Bob", "1234, rue Sainte-Catherine, Montréal");

        // ===== Exemple 1 : Client avec carte Points et paiement Cash =====
        System.out.println("\n--- Facture 1 : CartePoints + Cash ---");
        Facture facture1 = new Facture(50, paiementCash, cartePoints);

        // ===== Exemple 2 : Client avec carte Airmiles et paiement Credit =====
        System.out.println("\n--- Facture 2 : CarteAirmiles + Credit ---");
        Facture facture2 = new Facture(100, paiementCredit, carteAirmiles);

        // ===== Exemple 3 : Client avec carte et paiement Debit (Ne devrait donner aucune récompense) =====
        System.out.println("\n--- Facture 3 : CarteAirmiles + Debit ---");
        Facture facture3 = new Facture(30, paiementDebit, carteAirmiles);

        // ===== Exemple 4 : Essayer paiement par points avec carte =====
        System.out.println("\n--- Facture 4 : CartePoints + Points ---");
        try {
            Facture facture4 = new Facture(20, paiementPoints, cartePoints);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // ===== Exemple 5 : Essayer paiement par points sans carte (devrait lancer exception) =====
        System.out.println("\n--- Facture 5 : Sans carte + Points (erreur) ---");
        try {
            Facture facture5 = new Facture(20, paiementPoints);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // ===== Afficher récompenses accumulées =====
        System.out.println("\n--- Récompenses finales ---");
        System.out.println("Alice (Points) : " + ((CartePoints)cartePoints).getNombrePoints() + " points");
        System.out.println("Bob (Airmiles) : " + ((CarteAirmiles)carteAirmiles).getNombreMiles() + " miles");
    }
}

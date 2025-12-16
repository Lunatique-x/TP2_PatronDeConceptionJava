package facture;

import cartes.CarteClient;
import paiement.ModePaiement;

public class Facture {
    private CarteClient carte;
    private ModePaiement paiement;
    private float montant;

    public Facture(float montant, ModePaiement credit, CarteClient carteAirmiles) {
        this.montant = montant;
        this.paiement = credit;
        this.carte = carteAirmiles;

        credit.payer(montant);

        if (carteAirmiles != null) {
            carteAirmiles.appliquerRecompense(this); // utilise la strategy
        }

        System.out.println("Paiement effectue reussi");
    }

    public float getMontant() { return montant; }
    public ModePaiement getModePaiement() { return paiement; }
}
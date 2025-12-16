package facture;

import cartes.CarteClient;
import paiement.ModePaiement;

public class Facture {
    private CarteClient carte;
    private ModePaiement paiement;
    private float montant;

    public Facture(float montant, ModePaiement paiement, CarteClient carte) {
        this.montant = montant;
        this.paiement = paiement;
        this.carte = carte;

        paiement.payer(montant);

        if (carte != null) {
            carte.appliquerRecompense(this); // utilise la strategy
        }

        System.out.println("Paiement effectue reussi");
    }

    public float getMontant() { return montant; }
    public ModePaiement getModePaiement() { return paiement; }
}
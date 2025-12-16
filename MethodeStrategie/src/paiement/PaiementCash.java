package paiement;

public class PaiementCash implements ModePaiement {
    public void payer(float montant) {
        System.out.println("Paiement cash de " + montant + "$ valider");
    }

    public String getType() { return "cash"; }
}
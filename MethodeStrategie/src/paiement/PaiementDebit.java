package paiement;

public class PaiementDebit implements ModePaiement {
    public void payer(float montant) {
        System.out.println("Paiement débit de " + montant + "$ valider");
    }

    public String getType() { return "debit"; }
}
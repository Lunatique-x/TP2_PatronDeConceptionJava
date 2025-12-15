package paiement;

public class PaiementDebit implements ModePaiement {
    public void payer(float montant) {
        System.out.println("Paiement débit de " + montant + "$ effectué");
    }

    public String getType() { return "debit"; }
}
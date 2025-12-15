package paiement;

public class PaiementPoints implements ModePaiement {
    public void payer(float montant) {
        System.out.println("Paiement par points de " + montant + "$ effectué");
    }

    public String getType() { return "points"; }
}
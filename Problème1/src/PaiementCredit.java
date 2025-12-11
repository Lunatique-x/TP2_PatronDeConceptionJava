public class PaiementCredit implements ModePaiement {
    public void payer(float montant) {
        System.out.println("Paiement crédit de " + montant + "$ effectué");
    }

    public String getType() {
        return "credit";
    }
}

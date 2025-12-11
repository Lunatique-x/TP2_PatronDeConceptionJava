public class PaiementAirmiles implements ModePaiement {
    public void payer(float montant) {
        System.out.println("Paiement par Airmiles de " + montant + "$ effectué");
    }

    public String getType() {
        return "airmiles";
    }
}
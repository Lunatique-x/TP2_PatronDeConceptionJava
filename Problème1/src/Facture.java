public class Facture {
    private CarteClient carte;
    private ModePaiement paiement;
    private float montant;

    public Facture(float montant, ModePaiement paiement) {
        if (paiement.getType().equals("points") || paiement.getType().equals("airmiles")) {
            throw new IllegalArgumentException("Impossible de payer par points sans carte client.");
        }
        this.montant = montant;
        this.paiement = paiement;
        paiement.payer(montant);
        System.out.println("Paiement effectué avec succès.");
    }

    public Facture(float montant, ModePaiement paiement, CarteClient carte) {
        this.montant = montant;
        this.paiement = paiement;
        this.carte = carte;
        paiement.payer(montant);

        if (paiement.getType().equals("points") || paiement.getType().equals("airmiles") && carte != null)  {
            carte.retirer(this);
        } else {
            carte.recompenser(this);
        }
        System.out.println("Paiement effectué avec succès.");
    }

    public float getMontant() {
        return montant;
    }

    public ModePaiement getModePaiement() {
        return paiement;
    }
}
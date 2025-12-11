public interface ModePaiement {
    void payer(float montant);
    String getType();
}

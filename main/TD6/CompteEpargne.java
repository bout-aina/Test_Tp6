package main.TD6;

public class CompteEpargne extends Compte implements ICompte{
    private double tauxinteret;

    public CompteEpargne(String nom, int numcompte, double solde, double tauxinteret) {
        super(nom, numcompte, solde);
        this.tauxinteret = tauxinteret;
    }

    public CompteEpargne() {
        super();
    }

    public double getTauxinteret() {
        return tauxinteret;
    }

    public void setTauxinteret(double tauxinteret) {
        this.tauxinteret = tauxinteret;
    }
    public double calculinteret(){
        double interet = getSolde()*tauxinteret;
       return  getSolde()+interet;
    }

    @Override
    public void debiter(double montant) {
        if (getSolde()>=montant && montant>0){
            setSolde(getSolde()-montant);
        }
        else {
            System.out.println("solde insuffisant");
        }

    }

    @Override
    public void deposer(double montant) {
        if(montant>0){
            setSolde(getSolde()+montant);
        }
        else {
            System.out.println("montant invalide");
        }
    }
}

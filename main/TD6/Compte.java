package main.TD6;

public class Compte {
    private String nom;
    private int numcompte;
    private double solde;

    public Compte(String nom, int numcompte, double solde) {
        this.nom = nom;
        this.numcompte = numcompte;
        this.solde = solde;
    }

    public Compte() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(int numcompte) {
        this.numcompte = numcompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}

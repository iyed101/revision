public class Vendeur extends Salarie {
    private double Vente;
    private double Pourcentage;
    public Vendeur(int mat,String nm,double recrut,double Vente,double Pourcentage){
        super(mat, nm, recrut);
        this.Vente=Vente;
        this.Pourcentage=Pourcentage;
    }
    public double getVente(){
        return Vente;
    }
    public double getPourcentage(){
        return Pourcentage;
    }
    public void setVente(double vent){
        Vente=vent;
    }
    public void setPourcentage(double pourcent){
        Pourcentage=pourcent;
    }
    @Override
    public void affiche(){
        super.affiche();
        System.out.println(" de vente "+Vente+" de pourcentage "+Pourcentage);
    }
    public double salaire(){
        return super.salaire()+(Vente*Pourcentage);
    }
}

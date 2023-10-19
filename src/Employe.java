public class Employe extends Salarie {
    private double Hsupp;
    private double PHsupp;
    public Employe(int mat,String nm,double recrut,double Hsupp,double PHsupp){
        super(mat, nm, recrut);
        this.Hsupp=Hsupp;
        this.PHsupp=PHsupp;
    }
    public double getHsupp(){
        return Hsupp;
    }
    public double getPHsupp(){
        return PHsupp;
    }
    public void setHsupp(double H){
        Hsupp=H;
    }
    public void setPHsupp(double PH){
        PHsupp=PH;
    } 
    @Override
    public void affiche(){
        super.affiche();
        System.out.println(" d'heures supp "+Hsupp+" de prix "+PHsupp);
    }
    public double salaire(){
        return super.salaire()+(Hsupp*PHsupp);
    }
}
